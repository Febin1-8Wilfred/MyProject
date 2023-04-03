package projectpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.net.*;


public class RubeusHagrid 
	{
		/*_____________________________________________Variables:_____________________________________________*/
		public WebDriver driver;
		
		public static final String URL                  = "https://formy-project.herokuapp.com";
//		public static final String URL					= "https://demo.guru99.com/test/simple_context_menu.html";
//		public static final String URL					= "https://demoqa.com/droppable";
		
		public static final String xPathForDatePicker   = "//a [@class = 'btn btn-lg' and @href = '/datepicker']";
		public static final String xPathForDateField    = "//input [@class = 'form-control' and @id = 'datepicker']";
		public static final String xPathForMonth		= "//div [@class = 'datepicker-days']/table [@class = 'table-condensed']/thead/tr[2]/th[2]";
		public static final String xPathForRightArrow   = "//div [@class = 'datepicker-days']/table [@class = 'table-condensed']/thead/tr[2]/th[3]";
		public static final String xPathForDate			= "/html/body/div[2]/div[1]/table/tbody/tr/td";
		public static final String xPathFor18       	= "/html/body/div[2]/div[1]/table/tbody/tr[3]/td[7]";
		public static final String xPathForLogo			= "//a [@class = 'navbar-brand' and @id = 'logo']";
		
		public static final String xPathForDropDown     = "//a [@class = 'btn btn-lg' and @href = '/dropdown']";
		public static final String xPathForDropDownMenu = "//button [@class = 'btn btn-primary dropdown-toggle' and @id = 'dropdownMenuButton']";
		public static final String xPathForDropDownItem = "//body/div[1]/div[1]/div[1]/a[11]";
		
		public static final String xPathForCheckBox     = "//a [@class = 'btn btn-lg' and @href = '/checkbox']";
		public static final String checkBox1 			= "checkbox-1";
		public static final String xPathForCB1			= "//input [@type = 'checkbox' and @id = '"+checkBox1+"']";
		public static final String checkBox3 			= "checkbox-3";
		public static final String xPathForCB3			= "//input [@type = 'checkbox' and @id = '"+checkBox3+"']";
		
		public static final String xPathForFileUpload   = "//a [@class = 'btn btn-lg' and @href = '/fileupload']";
		public static final String xPathForChoose       = "//button [@class = 'btn btn-secondary btn-choose' and @type = 'button']";
		public static final String xPathForChooseAFile  = "//input [@id = 'file-upload-field' and @placeholder = 'Choose a file...']";
		public static final String xPathForReset        = "//button [@class = 'btn btn-warning btn-reset' and @type = 'button']";
		
		public static final String xPathForCopyAndPaste = "//a [contains(text(),'Complete Web Form' ) and @class = 'btn btn-lg']";
		public static final String xPathForFrom         = "//input [@type = 'text' and @id = 'first-name']";
		public static final String source               = "John";
		public static final String xPathForTo           = "//input [@type = 'text' and @id = 'last-name']";
		
		public static final String xPathForRightClick   = "//span [contains(text(), 'right click me')]";
		public static final String xPathForEdit         = "//span [contains(text(), 'Edit')]";
		public static final String XPathForEdit			= "//span[contains(text(),'Edit')]";
		public static final String XPathForDoubleClick  = "//button[contains(text(),'Double-Click Me To See Alert')]";
		
		//Modal:
		public static final String xPathForModal		= "//a [@class = 'btn btn-lg' and @href = '/modal']";
		public static final String xPathForOpenModal	= "//button [@type = 'button' and @class = 'btn btn-primary']";	
		public static final String xPathForM			= "//div [@class = 'modal-dialog']";
		
		//Page Scroll:
		public static final String XPathForPageScroll   = "//a [@class = 'btn btn-lg' and @href = '/scroll']";
		public static final String XPathForFullName     = "//input [@type = 'text' and @class = 'form-control']";
		
		//Radio Button:
		public static final String xPathForRadioButton  = "//a [@class = 'btn btn-lg' and @href = '/radiobutton']";
		public static final String radioButton			= "option3";
		public static final String xPathForRB			= "//input [@value = '"+radioButton+"']"; //Important
		
		//Switch Window:
		public static final String xPathForSwitchWindow = "//a [@class = 'btn btn-lg' and @href = '/switch-window']";
		public static final String xPathForOpenNewTab   = "//button [@type = 'button' and @class = 'btn btn-primary']";
		
		//Complete Web Form:
		public static final String xPathForForm         = "//a [contains(text(),'Complete Web Form' ) and @class = 'btn btn-lg']";
		public static final String xPathForFirstName    = "//input [@type = 'text' and @id = 'first-name']";
		public static final String firstName            = "John";
		public static final String xPathForLastName     = "//input [@type = 'text' and @id = 'last-name']";
		public static final String lastName             = "Doe";
		public static final String xPathForJobTitle     = "//input [@type = 'text' and @id = 'job-title']";
		public static final String jobTitle             = "QA";
		public static final String xPathForHighestLevel = "//input [@type = 'radio' and @id = 'radio-button-3']";
		public static final String xPathForSex			= "//input [@type = 'checkbox' and @id = 'checkbox-1']";
		public static final String xPathForYears		= "//select [@class = 'form-control' and @id = 'select-menu']";
		public static final String value        		= "3";
		public static final String xPathforDate			= "//input [@type = 'text' and @id = 'datepicker']";
		public static final String date					= "05/28/2019";
		public static final String xPathforSubmit    	= "//a [@class = 'btn btn-lg btn-primary' and @role = 'button']";
		public static final String xPathForThanks       = "//div [@class = 'alert alert-success' and @role = 'alert']";
		
		public String expectedURL, actualURL, url, parentWindowHandle, childWindowHandle;
//		public ExtentHtmlReporter reporter;
//		public ExtentReports extent;
//		public ExtentTest test;
		
		WebElement from, to;
		
//............................................................................................................................
		
		/*_____________________________________________Methods:_____________________________________________*/
		public void lumos()
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			}
		
		public void brokenLinks(WebDriver driver) throws IOException
			{
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println("The total number of links present in the site = " + links.size());
				System.out.println("The links are:");
				for (int i = 0; i < links.size(); i++)
					{
						url = links.get(i).getAttribute("href");
						verifyingURL(url); 
						
	//					File destination      = new File("C:\\Users\\HP\\Desktop\\Today\\Excel3.xlsx");
	//			  		FileInputStream fis   = new FileInputStream(destination);
	//			  		XSSFWorkbook workbook = new XSSFWorkbook(fis);
	//			  		XSSFSheet sheet       = workbook.createSheet("NameOfTheSheet");
	//			  		
	//			  		sheet.getRow(1).getCell(1).setCellValue(links.get(i).getAttribute("href"));
	//			  		
	//			  		FileOutputStream fos  = new FileOutputStream(destination);
	//			  		workbook.write(fos);
	//		  			workbook.close();	
					}
				driver.findElement(By.xpath(xPathForLogo)).click();
			}
		
		public void rightAndDoubleClick(WebDriver driver)
			{
				Actions action = new Actions(driver);
				action.contextClick(driver.findElement(By.xpath(xPathForRightClick))).perform();
				driver.findElement(By.xpath(XPathForEdit)).click();
				
				Alert alert1 = driver.switchTo().alert();
				alert1.accept();
				
				action.doubleClick(driver.findElement(By.xpath(XPathForDoubleClick))).perform();
				Alert alert2 = driver.switchTo().alert();
				System.out.println(alert2.getText()); 
				alert2.accept();
			}		
		
		public void copyAndPaste(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.xpath(xPathForCopyAndPaste)).click();
			from           = driver.findElement(By.xpath(xPathForFrom));
			from.sendKeys(source);
			to             = driver.findElement(By.xpath(xPathForTo));
			
			Actions action = new Actions(driver);
				action.keyDown(from, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
				action.keyDown(from, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
				action.keyDown(to, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
				action.perform();
			Thread.sleep(5000);	
			driver.findElement(By.xpath(xPathForLogo)).click();
		}		
			
		public void checkBox(WebDriver driver)
			{
				driver.findElement(By.xpath(xPathForCheckBox)).click();
				driver.findElement(By.xpath(xPathForCB1)).click();
				driver.findElement(By.xpath(xPathForCB3)).click();
				driver.findElement(By.xpath(xPathForLogo)).click();
			}		
		
		public void datePicker(WebDriver driver)
			{
				driver.findElement(By.xpath(xPathForDatePicker)).click();
				driver.findElement(By.xpath(xPathForDateField)).click();
				
				while(true)
					{
						if(driver.findElement(By.xpath(xPathForMonth)).getText().equals("November 2023"))
							{
								System.out.println(driver.findElement(By.xpath(xPathForMonth)).getText());
								break;
							}
						
						driver.findElement(By.xpath(xPathForRightArrow)).click();
					}
				
				driver.findElement(By.xpath(xPathFor18)).click();
				driver.findElement(By.xpath(xPathForLogo)).click();
			}
	
		public void dropDown(WebDriver driver)
			{
				driver.findElement(By.xpath(xPathForDropDown)).click();
				driver.findElement(By.xpath(xPathForDropDownMenu)).click();
				driver.findElement(By.xpath(xPathForDropDownItem)).click();
				driver.findElement(By.xpath(xPathForLogo)).click();
			}
		
		public void fileUpload(String string) throws AWTException 
			{
				StringSelection ss = new StringSelection(string);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				
				Robot robot = new Robot();
				robot.delay(3000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.delay(3000);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
		
		public void fileUploadUsingSendKeys(WebDriver driver)
			{
				driver.findElement(By.xpath(xPathForFileUpload)).click();
				driver.findElement(By.xpath(xPathForChooseAFile)).sendKeys("C:\\Users\\HP\\Desktop\\Family.jpg");
				driver.findElement(By.xpath(xPathForReset)).click();
				driver.findElement(By.xpath(xPathForLogo)).click();
			}	
		
		public void fileUploadUsingRobotClass(WebDriver driver) throws AWTException
			{
				driver.findElement(By.xpath(xPathForFileUpload)).click();
				driver.findElement(By.xpath(xPathForChoose)).click();
				fileUpload("E:\\Test document.docx");
				driver.findElement(By.xpath(xPathForLogo)).click();
			}	
		
		//Page Scroll:
		public void pageScroll(WebDriver driver)
			{
				driver.findElement(By.xpath(XPathForPageScroll)).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(XPathForFullName)));
				driver.findElement(By.xpath(xPathForLogo)).click();
			}
		
		//Radio Button:
		public void radioButton(WebDriver driver)
			{
				driver.findElement(By.xpath(xPathForRadioButton)).click();
				driver.findElement(By.xpath(xPathForRB)).click();
				driver.findElement(By.xpath(xPathForLogo)).click();
			}
		
		//Switch Window:
		public void switchWindow(WebDriver driver)
			{
				driver.findElement(By.xpath(xPathForSwitchWindow)).click();
				driver.findElement(By.xpath(xPathForOpenNewTab)).click();
				Set<String> allWindowHandles = driver.getWindowHandles();
				System.out.println(allWindowHandles);
				Iterator<String> iterator    = allWindowHandles.iterator();
				parentWindowHandle           = iterator.next();
				childWindowHandle            = iterator.next();
				driver.switchTo().window(childWindowHandle);
				driver.findElement(By.xpath(xPathForSwitchWindow)).click();
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath(xPathForLogo)).click();
			}
		
		//Complete Web Form: 
		public void submitForm(WebDriver driver)
			{
				driver.findElement(By.xpath(xPathForForm)).click();
				driver.findElement(By.xpath(xPathForFirstName)).sendKeys(firstName);
				driver.findElement(By.xpath(xPathForLastName)).sendKeys(lastName);
				driver.findElement(By.xpath(xPathForJobTitle)).sendKeys(jobTitle);
				driver.findElement(By.xpath(xPathForHighestLevel)).click();
				driver.findElement(By.xpath(xPathForSex)).click();
				driver.findElement(By.xpath(xPathForYears)).click();
				WebElement element = driver.findElement(By.xpath(xPathForYears));
				Select select = new Select(element);
				select.selectByValue(value);
				driver.findElement(By.xpath(xPathforDate)).sendKeys(date);
				driver.findElement(By.xpath(xPathforDate)).sendKeys(Keys.RETURN);
				driver.findElement(By.xpath(xPathforSubmit)).click();
			}
		
		public void verifyingURL(String url) throws IOException
			{
				URL u = new URL(url);
				HttpURLConnection con = (HttpURLConnection)u.openConnection();
				if (con.getResponseCode() >= 400)
					{
			        	System.out.println(url + " is an invalid link.");
					}
			  else if(con.getResponseCode() == 200)
				  {
				  		System.out.println(url + " is a valid link.");
				  }
			}
		
		public void verifying(WebDriver driver, String expectedURL, String actualURL)
			{
				System.out.println(this.expectedURL);
				System.out.println(this.actualURL);
				this.expectedURL  = expectedURL;
				this.actualURL    =	actualURL;
				System.out.println(this.expectedURL);
				System.out.println(this.actualURL);
				
				Assert.assertEquals(expectedURL, actualURL);
		}
	}
