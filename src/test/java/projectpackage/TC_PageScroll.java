package projectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_PageScroll extends ProfessorAlbusDumbledore
	{
		@Test
		public void test() 
			{
				lumos();
				pageScroll(driver);
				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
	}

