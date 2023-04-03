package projectpackage;

import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class TC_RadioButton extends ProfessorAlbusDumbledore
	{
		@Test
		@Description("Radio Button")
		
		public void test() throws InterruptedException 
			{
				lumos();
				radioButton(driver);
				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
	}

