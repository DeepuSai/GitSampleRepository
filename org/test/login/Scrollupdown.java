package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver",
				"C:\\Users\\HP\\deepakSelenium\\DeepuSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
		WebElement up = driver.findElement(By.xpath("(//span[text()='Create an account'])"));
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].ScrollIntoView(true)", down);
		jk.executeScript("arguments[0].ScrollIntoView(false)", up);

}
}