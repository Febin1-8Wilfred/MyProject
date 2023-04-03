package projectpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_CopyAndPaste extends ProfessorAlbusDumbledore
	{
		@Test
		public void test() throws InterruptedException 
			{
				lumos();
				copyAndPaste(driver);
				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
	}

