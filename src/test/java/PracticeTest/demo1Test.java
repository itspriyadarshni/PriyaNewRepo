package PracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo1Test {
	@Test (groups = "SmokeTest")
	public void owner() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.close();
	}
		
		@Test (groups = "RegressionTest")
		public void addOwner() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com");
			driver.close();
	}
}
