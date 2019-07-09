package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CodeReuse extends BaseClass {

	public static void main(String[] args) {
		WebDriver d = getDriver();
		launchURL("https://www.facebook.com/");
//	d.manage().window().maximize();
//		WebElement txtuser = d.findElement(By.id("email"));
//		type(txtuser,"deepak@gmail.com");
		

	}

}
