package Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimesoutKeyword {
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser is Launched");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser is Launched");
	}
	@BeforeMethod
	public void Login() {
		System.out.println("Logged into the application");
	}
	@AfterMethod
	public void Logout() {
		System.out.println("Logged out the application");
	}
	@Test(priority=1,timeOut=5000)
	public void Homepage() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("checking the homepage");
		}
	@Test(priority=2,invocationCount=5)
	public void Notificationpage() {
		System.out.println("checking the notificationpage");
		}


}
