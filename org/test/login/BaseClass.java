package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public static WebDriver getDriver() {
	System.setProperty("web.chrome.driver",
			"C:\\Users\\HP\\deepakSelenium\\DeepuSelenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	return driver;
}
public static void launchURL(String URL) {
	driver.get(URL);
}
public static void type(WebElement e, String value) {
	e.sendKeys(value);
	}
public static void btnclick(WebElement e) {
	e.click();
}
public static WebElement findElementbyID(String value) {
	WebElement e = driver.findElement(By.id(value));
	return e;
}
}
