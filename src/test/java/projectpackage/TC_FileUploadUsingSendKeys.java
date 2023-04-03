package projectpackage;

import org.testng.annotations.Test;

public class TC_FileUploadUsingSendKeys extends ProfessorAlbusDumbledore
	{
		@Test
		public void test() 
			{
				lumos();
				fileUploadUsingSendKeys(driver);
				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
	}

