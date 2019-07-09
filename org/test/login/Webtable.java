package org.test.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver",
				"C:\\Users\\HP\\deepakSelenium\\DeepuSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		for(int i = 0; i<trows.size();i++) {
			WebElement trow = trows.get(i);
			List<WebElement> tdatas = driver.findElements(By.tagName("td"));
			for(int j = 0;j<tdatas.size();j++) {
				WebElement tdata = tdatas.get(j);
				String text = tdata.getText();
				System.out.println(text);
			}
		}

	}

}
