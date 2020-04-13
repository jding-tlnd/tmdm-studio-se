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
package com.amalto.workbench.providers;

import org.w3c.dom.Element;

import com.amalto.workbench.exadapter.IExAdapter;

public interface IXSDTreeLabelPoviderExAdapter extends IExAdapter<XSDTreeLabelProvider> {

    String getText4SourceElement(Element obj) throws Exception;
}
