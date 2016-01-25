// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.ui.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.talend.core.model.properties.Item;

import com.amalto.workbench.exadapter.IExAdapter;

/**
 * created by HHB on 2014-1-9 Detailled comment
 * 
 */
public interface IXSDEditor2ExAdapter extends IExAdapter<XSDEditor2> {

    void init(IEditorInput editorInput);

    void dispose();

    boolean isDirty();

    void doSave(Item item, DataModelMainPage2 dMainPage, IProgressMonitor monitor);

    Object getAdapter(Class type);
}
