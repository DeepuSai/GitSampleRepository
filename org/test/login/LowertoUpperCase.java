package org.test.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LowertoUpperCase {

	public static void main(String[] args) throws Exception {
		System.setProperty("web.chrome.driver",
				"C:\\Users\\HP\\deepakSelenium\\DeepuSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		Actions acc = new Actions(driver);
		acc.keyDown(email, Keys.SHIFT).sendKeys(email, "DePAk").keyUp(email, Keys.SHIFT).perform();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		email.sendKeys("hello");

	}

}
