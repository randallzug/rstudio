/*
 * NewDirectoryNavigationPage.java
 *
 * Copyright (C) 2009-12 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.projects.ui.newproject;

import java.util.ArrayList;

import org.rstudio.core.client.widget.WizardNavigationPage;
import org.rstudio.core.client.widget.WizardPage;
import org.rstudio.studio.client.projects.model.NewProjectInput;
import org.rstudio.studio.client.projects.model.NewProjectResult;
import org.rstudio.studio.client.workbench.model.SessionInfo;

public class NewDirectoryNavigationPage 
            extends WizardNavigationPage<NewProjectInput,NewProjectResult>
{

   public NewDirectoryNavigationPage(SessionInfo sessionInfo)
   {
      super("New Directory", 
            "Start a project in a brand new working directory",
            "Project Type",
            NewProjectResources.INSTANCE.newProjectDirectoryIcon(),
            NewProjectResources.INSTANCE.newProjectDirectoryIconLarge(),
            createPages(sessionInfo));
   }

  
   private static ArrayList<WizardPage<NewProjectInput, NewProjectResult>>
                                         createPages(SessionInfo sessionInfo)
   {   
      ArrayList<WizardPage<NewProjectInput, NewProjectResult>> pages = 
            new  ArrayList<WizardPage<NewProjectInput, NewProjectResult>>();
      
      pages.add(new NewDirectoryPage());
      pages.add(new NewPackagePage());
      pages.add(new NewShinyAppPage());
      return pages;
   }
   

}
