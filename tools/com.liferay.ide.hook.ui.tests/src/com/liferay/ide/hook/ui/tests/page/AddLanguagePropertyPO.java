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

package com.liferay.ide.hook.ui.tests.page;

import org.eclipse.swtbot.swt.finder.SWTBot;

import com.liferay.ide.hook.ui.tests.HookConfigurationWizard;
import com.liferay.ide.project.ui.tests.ProjectWizard;
import com.liferay.ide.ui.tests.swtbot.page.DialogPO;
import com.liferay.ide.ui.tests.swtbot.page.TextPO;

/**
 * @author Vicky Wang
 */
public class AddLanguagePropertyPO extends DialogPO implements HookConfigurationWizard, ProjectWizard
{

    private TextPO _languagePropertyFileText;

    public AddLanguagePropertyPO( SWTBot bot )
    {
        this( bot, TEXT_BLANK );
    }

    public AddLanguagePropertyPO( SWTBot bot, String title )
    {
        super( bot, title, BUTTON_CANCEL, BUTTON_OK );

        _languagePropertyFileText = new TextPO( bot, LABLE_LANGUAGE_PROPERTY_FILE );
    }

    public void setLanguagePropertyFileText( String text )
    {
        _languagePropertyFileText.setText( text );
    }

}