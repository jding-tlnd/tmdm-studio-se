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
package com.amalto.workbench.i18n;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;



/**
 * Core of i18n management.<br/>
 *
 * Features :
 * <ul>
 * <li>String without args</li>
 * <li>String with args</li>
 * </ul>
 * Coming features :
 * <ul>
 * <li>Dates</li>
 * <li>Using many file per plug-in</li>
 * </ul>
 *
 * Using plug-in can create their implementation by copy the DefaultMessagesImpl in the same package.<br/> * $Id:
 * MessagesCore.java,v 1.8 2006/07/26 16:02:00 amaumont Exp $
 *
 */
public abstract class MessagesCore {



    public static final String KEY_NOT_FOUND_PREFIX = "!!!"; //$NON-NLS-1$

    public static final String KEY_NOT_FOUND_SUFFIX = "!!!"; //$NON-NLS-1$

    /**
     * Returns the i18n formatted message for <i>key</i> in the specified bundle.
     *
     * @param key - the key for the desired string
     * @param resourceBundle - the ResourceBundle to search in
     * @return the string for the given key in the given resource bundle
     */
    public static String getString(String key, String pluginId, ResourceBundle resourceBundle) {
        if (resourceBundle == null) {
            return KEY_NOT_FOUND_PREFIX + key + KEY_NOT_FOUND_SUFFIX;
        }
        try {
            return resourceBundle.getString(key);

        } catch (MissingResourceException e) {
            return KEY_NOT_FOUND_PREFIX + key + KEY_NOT_FOUND_SUFFIX;
        }
    }

    /**
     * Returns the i18n formatted message for <i>key</i> and <i>args</i> in the specified bundle.
     *
     * @param key - the key for the desired string
     * @param resourceBundle - the ResourceBundle to search in
     * @param args - arg to include in the string
     * @return the string for the given key in the given resource bundle
     */
    // modified by wzhang. add a pluginId parameter
    public static String getString(String key, String pluginId, ResourceBundle resourceBundle, Object... args) {
        return MessageFormat.format(getString(key, pluginId, resourceBundle), args);
    }

    /**
     * Returns the i18n formatted message for <i>key</i> and <i>args</i> in the specified bundle.
     *
     * @param key - the key for the desired string
     * @param resourceBundle - the ResourceBundle to search in
     * @param args - arg to include in the string
     * @return the string for the given key in the given resource bundle
     * @deprecated
     */
    public static String getString(String key, ResourceBundle resourceBundle, Object... args) {
        return MessageFormat.format(getString(key, null, resourceBundle), args);
    }

    /**
     * Returns the i18n formatted message for <i>key</i> in the specified bundle.
     *
     * @param key - the key for the desired string
     * @param resourceBundle - the ResourceBundle to search in
     * @return the string for the given key in the given resource bundle
     * @deprecated
     */
    public static String getString(String key, ResourceBundle resourceBundle) {
        return getString(key, null, resourceBundle);
    }
}
