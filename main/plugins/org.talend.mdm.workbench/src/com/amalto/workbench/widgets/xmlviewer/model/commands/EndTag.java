/*****************************************************************************
 * This file is part of Rinzo
 * 
 * Author: Claudio Cancinos WWW: https://sourceforge.net/projects/editorxml Copyright (C): 2008, Claudio Cancinos
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation; either version 2 of the License, or (at your option) any
 * later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this program; If not, see
 * <http://www.gnu.org/licenses/>
 ****************************************************************************/
package com.amalto.workbench.widgets.xmlviewer.model.commands;

import com.amalto.workbench.widgets.xmlviewer.model.XMLNode;
import com.amalto.workbench.widgets.xmlviewer.model.tags.nodef.NoDefTagDefinitionProvider;

/**
 * 
 */
public class EndTag implements RelateElementsCommand {

	public void excecute(XMLNode rootNode, NoDefTagDefinitionProvider tagDefinitionProvider) {
		if (ElementsToRelate.currentNode.getTagName().equals(ElementsToRelate.node.getTagName())) {
			ElementsToRelate.currentNode.setCorrespondingNode(ElementsToRelate.node);
			ElementsToRelate.node.setCorrespondingNode(ElementsToRelate.currentNode);
		}

		ElementsToRelate.currentNode = ElementsToRelate.parentNode;

		if (ElementsToRelate.parentNode != null) {
			ElementsToRelate.parentNode = ElementsToRelate.parentNode.getParent();
		} else {
			ElementsToRelate.parentNode = rootNode;
		}
	}
}
