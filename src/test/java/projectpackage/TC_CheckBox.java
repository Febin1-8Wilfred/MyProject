package projectpackage;

import org.testng.annotations.Test;

public class TC_CheckBox extends ProfessorAlbusDumbledore
	{
		@Test
		public void test() 
			{
				lumos();
				checkBox(driver);
				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
	}

