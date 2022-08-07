package myTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertt 
{
	/*Soft assertion: soft validation: if a soft assertion is getting failed--> test case will not be 
	 * marked as passed as well as nest line will be executed
	 * assetAll(): to mark the test case as failed, if any soft assertion is getting failed.
	 */
	
	SoftAssert softAssert = new SoftAssert();

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.ca/");
	}
	    
	@Test(priority = 1)
	public void googleTitleTest() {
		driver.getTitle();
		softAssert.assertEquals(false, true," Test of googleTitleTest"); //soft assertion
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public void googleLogoTest() {
		driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		softAssert.assertEquals(false, true, " Test of googleLogoTest"); //soft assertion
		softAssert.assertAll();
	} 
	
	@Test(priority = 3)
	public void mailLinktest()
	{
		driver.findElement(By.linkText("Gmail")) .isDisplayed();
		softAssert.assertEquals(true, false, " Test of mailLinktest"); //soft assertion
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
