package projectpackage;

import org.testng.annotations.Test;

public class TC_DropDown extends ProfessorAlbusDumbledore
	{
		@Test
		public void test() 
			{
				lumos();
				dropDown(driver);
				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
		}
//	}
