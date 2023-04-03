package projectpackage;

import org.testng.annotations.Test;

import io.qameta.allure.Description;


public class TC_SubmitForm extends ProfessorAlbusDumbledore
	{
		@Test 
		@Description("Submit Form")
				
		public void test() 
			{
//				test = extent.createTest("Complete Web Form");
				lumos();
				submitForm(driver);
				verifying(driver, "https://formy-project.herokuapp.com/tha", driver.getCurrentUrl());
			}
	}
