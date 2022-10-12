package TestNGBasics;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod {
@BeforeMethod
public void login() {
	System.out.println("Logged in to the application");
	Reporter.log("Logged in to the application");
}
@AfterMethod
public void logout() {
	System.out.println("Logged out to the application");
	Reporter.log("Logged out to the application");
}
@Test(priority=3)
public void homepage() {
	System.out.println("checking the homepage");
	Reporter.log("checking the homepage");
}
@Test(priority=1)
public void loginpage() {
	System.out.println("checking the loginpage");
	Reporter.log("checking the loginpage");
}
@Test(priority=2)
public void notificationpage() {
	System.out.println("checking the notificationpage");
	Reporter.log("checking the notificationpage");
}

}
