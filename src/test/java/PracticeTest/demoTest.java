package PracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoTest {
@Test (groups = "SmokeTest")
public void customer() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	driver.close();
}
@Test (groups = "RegressionTest")
public void addCustomer() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	driver.close();
}
}

