package BeforeSuiteAndAfterSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
@BeforeSuite
public void EmailConfiguration() {
	System.out.println("Email is configured");
}
@AfterSuite
public void EmailSent() {
	System.out.println("Email is sent after completion");
}
@BeforeTest
public void openDB() {
	System.out.println("Database is opened");
}
@AfterTest
public void closeDB() {
	System.out.println("Database is closed");
}
@BeforeClass
public void openBrowser() {
	System.out.println("Brower is opened");
}
@AfterClass
public void closeBrowser() {
	System.out.println("Brower is closed");
}
@Test
public void m1() {
	System.out.println("Method m1");
}
@Test
public void m2() {
	System.out.println("Method m2");
}
@Test
public void m3() {
	System.out.println("Method m3");
}

}
