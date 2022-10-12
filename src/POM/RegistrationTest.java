package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest   {

	WebDriver driver;
	 
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@AfterClass
public void teardown() {
	driver.close();
}
@Test
public void FacebookRegistrationPageTest_positive() {
	RegistrationPage rp=new RegistrationPage(driver);
	rp.ClickFacebookSignupLink();
	rp.VerifyFacebookRegistrationPageFblogo();
	rp.VerifyFacebookRegistrationPageAlreadyAccount();
	rp.SetFacebookRegistrationpageFirstname("akshay");
	rp.SetFacebookRegistrationpageLastname();
	rp.SetFacebookRegistrationPageMobileEmail();
	rp.SetFacebookRegistrationPagepassword();
	rp.SetFacebookRegistrationPageBirthday();
	rp.SetFacebookRegistrationPageBirthmonth();
	rp.SetFacebookRegistrationPageBirthyear();
	rp.setFacebookRegistrationPageGender("male");
	rp.ClickFacebookRegistrationPageSubmitButton();
}

}
