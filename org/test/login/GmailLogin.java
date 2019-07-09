package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class GmailLogin {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver","C:\\Users\\HP\\deepakSelenium\\DeepuSelenium\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.gmail.com");
driver.manage().window().maximize();
WebElement email = driver.findElement(By.xpath("(//input[@id='identifierId'])"));
email.sendKeys("deepakjayaraam@gmail.com");
WebElement clickbtn = driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])"));
clickbtn.click();
//driver.getWindowHandle();
String handle = driver.getWindowHandle();
WebElement password = driver.findElement(By.xpath("(//input[@name='password'])"));
password.sendKeys("deepakjayaraam123");
	}

}
