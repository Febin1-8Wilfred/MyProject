package projectpackage;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_FileUploadUsingAutoIt extends ProfessorAlbusDumbledore
	{
		@Test
		public void test() throws AWTException, IOException 
			{
				lumos();
				driver.findElement(By.xpath(xPathForFileUpload)).click();
				driver.findElement(By.xpath(xPathForChoose)).click();
				Runtime.getRuntime().exec("C:\\Users\\HP\\Downloads\\FileUpload.exe");
//				fileUploadUsingRobotClass(driver);
//				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
	}

