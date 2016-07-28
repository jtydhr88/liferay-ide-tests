/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.project.ui.tests.page;

import org.eclipse.swtbot.swt.finder.SWTBot;

import com.liferay.ide.project.ui.tests.ModuleProjectWizard;
import com.liferay.ide.ui.tests.swtbot.page.TablePO;
import com.liferay.ide.ui.tests.swtbot.page.TextPO;
import com.liferay.ide.ui.tests.swtbot.page.ToolbarButtonPO;
import com.liferay.ide.ui.tests.swtbot.page.WizardPO;

/**
 * @author Ying Xu
 */
public class ModuleProjectWizardSecondPagePO extends WizardPO implements ModuleProjectWizard
{

    private TextPO _componentClassName;
    private TextPO _packageName;
    private TextPO _serviceName;
    private TablePO _properties;
    private ToolbarButtonPO _browseButton;
    private ToolbarButtonPO _addPropertyKeyButton;
    private ToolbarButtonPO _moveUpButton;
    private ToolbarButtonPO _moveDownButton;
    private ToolbarButtonPO _deleteButton;

    public ModuleProjectWizardSecondPagePO( SWTBot bot )
    {
        this( bot, TEXT_BLANK );
    }

    public ModuleProjectWizardSecondPagePO( SWTBot bot, int validationMessageIndex )
    {
        this( bot, TEXT_BLANK, validationMessageIndex );
    }

    public ModuleProjectWizardSecondPagePO( SWTBot bot, String title )
    {
        this( bot, title, INDEX_DEFAULT_VALIDATION_MESSAGE );
    }

    public ModuleProjectWizardSecondPagePO( SWTBot bot, String title, int validationMessageIndex )
    {
        super( bot, title, BUTTON_CANCEL, BUTTON_FINISH, BUTTON_BACK, BUTTON_NEXT, validationMessageIndex );
        _componentClassName = new TextPO( bot, LABEL_MODULE_COMPONENT_CLASS_NAME );
        _packageName = new TextPO( bot, LABEL_MODULE_PACKAGE_NAME );
        _serviceName = new TextPO( bot, LABEL_MODULE_SERVICE_NAME );
        _properties = new TablePO( bot, LABEL_MODULE_PROPERTIES );
        _browseButton = new ToolbarButtonPO( bot, BUTTON_BROWSE );
        _addPropertyKeyButton = new ToolbarButtonPO( bot, TOOLBARBOTTON_ADD_PROPERTY_KEY );
        _moveUpButton = new ToolbarButtonPO( bot, TOOLBARBOTTON_MOVE_UP );
        _moveDownButton = new ToolbarButtonPO( bot, TOOLBARBOTTON_MOVE_DOWN );
        _deleteButton = new ToolbarButtonPO( bot, TOOLBARBOTTON_DELETE );
    }

    public ToolbarButtonPO getBrowseButton()
    {
        return _browseButton;
    }

    public ToolbarButtonPO getAddPropertyKeyButton()
    {
        return _addPropertyKeyButton;
    }

    public ToolbarButtonPO getMoveUpButton()
    {
        return _moveUpButton;
    }

    public ToolbarButtonPO getMoveDownButton()
    {
        return _moveDownButton;
    }

    public ToolbarButtonPO getDeleteButton()
    {
        return _deleteButton;
    }

    public TextPO getComponentClassName()
    {
        return _componentClassName;
    }

    public TextPO getPackageName()
    {
        return _packageName;
    }

    public TextPO getServiceName()
    {
        return _serviceName;
    }

    public TablePO getProperties()
    {
        return _properties;
    }

    public void setComponentClassName( TextPO _componentClassName )
    {
        this._componentClassName = _componentClassName;
    }

    public void setPackageName( TextPO _packageName )
    {
        this._packageName = _packageName;
    }

    public void setProperties( TablePO _properties )
    {
        this._properties = _properties;
    }

    public void doubleClick( int row, int column )
    {
        _properties.doubleClick( row, column );
    }

    public void setPropertiesText( int index, String text )
    {
        _properties.setText( index, text );
    }

}
