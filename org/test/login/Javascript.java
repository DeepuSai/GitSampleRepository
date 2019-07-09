package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver",
				"C:\\Users\\HP\\deepakSelenium\\DeepuSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].setAttribute('value','deepak@gmail.com')",email);
		jk.executeScript("arguments[0].setAttribute('value','123456789')", pwd);
		jk.executeScript("arguments[0].click()", btn);

	}

}
