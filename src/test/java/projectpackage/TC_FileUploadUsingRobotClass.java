package projectpackage;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class TC_FileUploadUsingRobotClass extends ProfessorAlbusDumbledore
	{
		@Test
		public void test() throws AWTException 
			{
				lumos();
				fileUploadUsingRobotClass(driver);
				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
	}

