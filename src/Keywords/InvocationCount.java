package Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
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
@Test(priority=1)
public void Homepage() {
	System.out.println("checking the homepage");
	}
@Test(priority=2,invocationCount=5)
public void Notificationpage() {
	System.out.println("checking the notificationpage");
	}


}
