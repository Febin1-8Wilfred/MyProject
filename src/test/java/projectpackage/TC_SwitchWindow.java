package projectpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;

public class TC_SwitchWindow extends ProfessorAlbusDumbledore
	{
		@Test 
		@Description("Switch Window")
		
		public void test() 
			{
//				test = extent.createTest("Switch Window");
				lumos();
				switchWindow(driver);
				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
	}

