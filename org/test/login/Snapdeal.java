package org.test.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver",
				"C:\\Users\\HP\\deepakSelenium\\DeepuSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.sendKeys("Iphones");
		WebElement clickgo = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		clickgo.click();
		WebElement title = driver.findElement(By.xpath("//p[text()='Apple iphone 6s plus ( 16GB , 2 GB ) Gold']"));
	title.click();
	String parentwindow = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	System.out.println(parentwindow);
	System.out.println(all);
	List<String> li = new ArrayList(all);
	li.addAll(all);
	String s = li.get(2);
	driver.switchTo().window(s);
	WebElement buynow = driver.findElement(By.xpath("//div[@id='buy-button-id']"));
	buynow.click();
	WebElement fblogin = driver.findElement(By.xpath("//div[@id='fblogin']"));
	fblogin.click();
	fblogin.clear();
	driver.switchTo().defaultContent();
	}

}
