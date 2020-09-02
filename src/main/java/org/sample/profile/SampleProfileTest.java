package org.sample.profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SampleProfileTest {

	@Test
	public void sample() {
	String userProfile= "C:\\Users\\Ankit Mittal\\AppData\\Local\\Google\\Chrome\\User Data";
	ChromeOptions options = new ChromeOptions();
	options.addArguments("user-data-dir="+userProfile);
	options.addArguments("--start-maximized");
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://www.google.com");
}
}
