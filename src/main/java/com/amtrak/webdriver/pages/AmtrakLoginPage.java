package com.amtrak.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amtrak.webdriver.pages.AmtrakHomePage;

public class AmtrakLoginPage {
	private WebDriver webdriver;

	public AmtrakLoginPage(WebDriver driver) {
		webdriver = driver;
	}

	// 1.get the xpath of the login link thats inside a form and click it and
	// then enter username and password for it
	public void login(String name, String uname, String pwd) {
		
		WebDriverWait myWait = new WebDriverWait(webdriver, 5);
		String baseUrl = "https://www.amtrak.com/home";
		webdriver.get(baseUrl);
		// wait until login link load.
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		webdriver.findElement(By.linkText("Log in")).click();
		//enter uname, pwd
		webdriver.findElement(By.name("_name")).sendKeys(uname);
		webdriver.findElement(By.name("_password")).sendKeys(pwd);
		webdriver.findElement(By.name("login")).submit();
		
	}
	
}
