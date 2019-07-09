package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver",
				"C:\\Users\\HP\\deepakSelenium\\DeepuSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[3]"));
WebElement destn = driver.findElement(By.xpath("(//ol[@id='amt7'])"));
Actions acc = new Actions(driver);
acc.dragAndDrop(source, destn).perform();
//acc.doubleClick(course).perform();

////		course.click();
////		Select text = new Select(course);
////		text.selectByVisibleText("Oracle Training");
//		Actions acc = new Actions(driver);
//		acc.doubleClick(course).perform();

	}

}
