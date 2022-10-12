package Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountWithThreadPoolSize {
@Test(invocationCount=5,threadPoolSize=5)

public void openBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    
    driver.manage().window().maximize();
    
    System.out.println(driver.getCurrentUrl());
    
    driver.close();
}
}
