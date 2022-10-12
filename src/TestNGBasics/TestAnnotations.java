package TestNGBasics;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotations {
@Test(priority=1)
public static void openurl() {
	System.out.println("Url is opened");
	Assert.fail();
}
@Test(priority=2)
public static void login() {
	System.out.println("Url is opened");
}
@Test(priority=3)
public static void logout() {
	System.out.println("Url is opened");
}
}
