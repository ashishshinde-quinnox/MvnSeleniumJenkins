package testpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

	public String baseUrl = "http://www.quinnox.com";
	public WebDriver driver = new FirefoxDriver();
	
	@Test
  public void verifyHomepageTitle() {
			driver.get(baseUrl);
			String expectedTitle = "IT Services, Business Software Solutions, Innovative Technology Solutions at Quinnox";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.quit();
  }

}
