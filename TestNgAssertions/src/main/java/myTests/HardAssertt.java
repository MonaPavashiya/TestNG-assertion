package myTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertt 
{
	/*Hard assertion: hard validation: if a hard assertion is getting failed --> immediately
	*test case will be marked as failed and test case will be terminated.
	*/
	
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
		Assert.assertEquals(true, false," Test of googleTitleTest");
		
	}

	@Test(priority = 2)
	public void googleLogoTest() {
		driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertEquals(true, false, " Test of googleLogoTest"); 
		
	} 
	
	@Test(priority = 3)
	public void mailLinktest()
	{
		driver.findElement(By.linkText("Gmail")) .isDisplayed();
		Assert.assertEquals(true, false, " Test of mailLinktest"); 
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
