package org.test.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectProject {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver",
				"C:\\Users\\HP\\deepakSelenium\\DeepuSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement command = driver.findElement(By.id("selenium_commands"));
		Select commands = new Select(command);
		commands.selectByIndex(0);
		commands.selectByIndex(1);
		commands.selectByVisibleText("Switch Commands");
		List<WebElement> op = commands.getAllSelectedOptions();
		for(WebElement x:op) {
			String data = x.getText();
			System.out.println(data);
		}
		WebElement first = commands.getFirstSelectedOption();
		System.out.println(first.getText());

	}
}
