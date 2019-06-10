// ============================================================================
//
// Copyright (C) 2006-2019 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package com.amalto.workbench.availablemodel;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IMenuManager;

import com.amalto.workbench.editors.DataClusterBrowserMainPage;
import com.amalto.workbench.editors.DataModelMainPage;
import com.amalto.workbench.editors.XObjectBrowser;
import com.amalto.workbench.editors.XObjectEditor;
import com.amalto.workbench.models.TreeObject;
import com.amalto.workbench.models.TreeParent;
import com.amalto.workbench.webservices.TMDMService;
import com.amalto.workbench.webservices.TMDMService;

public interface IAvailableModel {

    /**
     * add treeobjects when refresh the serverroot treenode
     *
     * @param service
     * @param monitor
     * @param serverRoot
     */
    void addTreeObjects(TMDMService service, IProgressMonitor monitor, TreeParent serverRoot);

    void deleteTreeObject(TMDMService port, TreeObject xobject);

    /**
     * Fill the context menu when right click the object in the server tree
     *
     * @param xobject
     * @param manager
     */
    void fillContextMenu(TreeObject xobject, IMenuManager manager);

    /**
     * XObjectBrowser to add page
     *
     * @param editor
     */
    void addPage(TreeObject xobject, XObjectBrowser editor);

    /**
     * XObjectEditor to add page
     *
     * @param editor
     */
    void addPage(TreeObject xobject, XObjectEditor editor);

    /**
     * Browse datacluster menuAboutToShow
     *
     * @param manager
     */
    void menuAboutToShow(IMenuManager manager, DataClusterBrowserMainPage page);

    /**
     * Fill the context menu when right click the object in the datamodel tree
     *
     * @param obj
     * @param manager
     */
    void fillContextMenu(Object obj, IMenuManager manager, DataModelMainPage page, String dataModelName);

    /**
     * double click on the element of datamodel tree
     *
     * @param type
     * @param page
     * @param dataModelName
     */
    void doubleClickOnElement(int type, DataModelMainPage page, String dataModelName);

    /**
     * Import the object that was exported
     *
     * @param obj
     * @param filename
     * @return
     */
    void doImport(TreeObject obj, String importFolder);
}
