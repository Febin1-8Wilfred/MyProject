package projectpackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Modal extends ProfessorAlbusDumbledore
	{
		@Test
		public void test() 
			{
				lumos();
				driver.findElement(By.xpath(xPathForModal)).click();
				driver.findElement(By.xpath(xPathForOpenModal)).click();
				driver.findElement(By.xpath(xPathForM)).click();
				System.out.println(driver.findElement(By.xpath("//div [@class = 'modal-body']")).getText());
//				checkBox(driver);
//				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
			}
	}

