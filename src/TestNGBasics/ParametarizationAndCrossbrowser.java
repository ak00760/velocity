package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametarizationAndCrossbrowser {
	
WebDriver driver;
@Parameters("browser")
@Test(priority=1)
public void CrossBrowserTesting(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver_win32\\chromedriver.exe");
   driver=new ChromeDriver();    
	 }else if
	(browser.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\selenium files\\chromedriver_win32\\chromedriver.exe");
   driver=new FirefoxDriver();    
   }else {
	System.out.println("Wrong browser name selected");
}
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

@Test(priority=2)
public void verifyCurrentUrl() {
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
}
@Test(priority=3)
public void verifyPageTitle() {
	Assert.assertEquals(driver.getTitle(), "Facebook-log in or sign up");
}
@Test(priority=4)
public void VerifyUsernameField() {
	WebElement usernamefield=driver.findElement(By.xpath("//input[@name='email']"));
	Assert.assertTrue(usernamefield.isDisplayed());
	usernamefield.sendKeys("Akshay");
}
@Test(priority=5)
public void VerifyPasswordField() {
	WebElement passwordfield=driver.findElement(By.xpath("//input[@name='pass']"));
	Assert.assertTrue(passwordfield.isDisplayed());
	passwordfield.sendKeys("Akshay@123");
}
@Test(priority=6)
public void ClickLoginButton() {
	  WebElement loginbtn=driver.findElement(By.xpath("//button[@value='1']"));
	  Assert.assertTrue(loginbtn.isDisplayed());
	  
	   loginbtn.click();
}


}
