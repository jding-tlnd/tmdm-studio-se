// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.webapp.synchronization2.server.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.amalto.webapp.core.util.Util;

public class TreeNode {

    private String text;

    private boolean leaf;

    private short type;// Element.TEXT_NODE or Element.ELEMENT_NODE

    private TreeNode[] childNodes = new TreeNode[0];

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public TreeNode[] getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(TreeNode[] childNodes) {
        this.childNodes = childNodes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        Pattern AMP = Pattern.compile("&((amp)*)"); //$NON-NLS-1$
        Matcher matchamp = AMP.matcher(text);
        StringBuffer sb = null;
        while (matchamp.find()) {
            String other = matchamp.group(1);
            if (other.isEmpty()) {
                if (sb == null) {
                    sb = new StringBuffer();
                }
                matchamp.appendReplacement(sb, "&amp;"); //$NON-NLS-1$
            }
        }
        if (sb != null) {
            matchamp.appendTail(sb);
        }
        this.text = sb != null ? sb.toString() : text;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public String serialize() {
        return getXMLStr(this);
    }

    private String getXMLStr(TreeNode node) {
        StringBuffer sb = new StringBuffer();
        if (node.text.trim().length() > 0) {
            sb.append('<').append(node.text).append('>');
            for (TreeNode n : node.childNodes) {
                if (n.isLeaf() && n.text.trim().length() > 0) {
                    if (n.type == Node.TEXT_NODE)
                        sb.append(n.text);
                    else if (n.type == Node.ELEMENT_NODE)
                        sb.append('<').append(n.text).append("/>"); //$NON-NLS-1$
                } else {
                    sb.append(getXMLStr(n));
                }
            }
            sb.append("</").append(node.text).append('>'); //$NON-NLS-1$
        }
        return sb.toString();
    }

    public TreeNode deserialize(String xml) throws Exception {
        if (xml == null)
            return null;
        Element result = Util.parse(xml).getDocumentElement();
        return parseElement(result);
    }

    private TreeNode parseElement(Element element) throws Exception {
        TreeNode node = new TreeNode();
        node.setType(Node.ELEMENT_NODE);
        node.setText(element.getNodeName());
        NodeList list = element.getChildNodes();
        List<TreeNode> childs = new ArrayList<TreeNode>();
        if (list != null && list.getLength() > 0) {
            for (int i = 0; i < list.getLength(); i++) {
                Node el = (Node) list.item(i);
                if (el.getNodeType() == Node.TEXT_NODE && el.getNodeValue().trim().length() > 0) {
                    TreeNode child = new TreeNode();
                    child.setText(el.getNodeValue().trim());
                    child.setLeaf(true);
                    child.setType(Node.TEXT_NODE);
                    childs.add(child);
                } else if (el.getNodeType() == Node.ELEMENT_NODE) {

                    childs.add(parseElement((Element) el));
                }
            }
            node.setLeaf(false);
        } else {
            node.setLeaf(true);
        }
        node.setChildNodes(childs.toArray(new TreeNode[0]));
        return node;
    }

}
