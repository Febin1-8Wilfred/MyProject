package projectpackage;

import org.testng.annotations.Test;

public class TC_DatePicker extends ProfessorAlbusDumbledore
	{
		@Test
		public void test() 
			{
				lumos();
				datePicker(driver);
				verifying(driver, "https://formy-project.herokuapp.com/", driver.getCurrentUrl());
//				test = extent.createTest("FBTitleVerification");
//				List<WebElement> dates = driver.findElements(By.xpath(xPathForDate));
//				System.out.println(dates.size());
//				
//				for (int i = 0; i < dates.size(); i++)
//					{
//						if(dates.get(i).getText().equals("18"))
//							{
//								dates.get(i).click();
//								System.out.println("The desired date has been selected successfully!");
//								System.out.println("The selected date is: " + dates.get(i).getText());
//							}
			}
		}
//	}
