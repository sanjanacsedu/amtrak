package com.amtrak.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DestinationsPage {
	private final WebDriver webdriver;

	public DestinationsPage(WebDriver driver) {
		webdriver = driver;
	}

	// public List<String> getStations(int zipcode){}

	public void getrouteMap() {
		Actions builder = new Actions(webdriver);
		Action mouseOvercategory=builder.moveToElement(webdriver.findElement(By.cssSelector(".destinations a"))).build();
		mouseOvercategory.perform();
		try {
			WebDriverWait wait = new WebDriverWait(webdriver, 5);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("City Guides & Walking Tours")));
			webdriver.findElement(By.linkText("City Guides & Walking Tours")).click();
		} catch (Exception e) {
			System.out.println("Unable to find the City Guides" + e.getMessage());
		}
		// WebElement routebtn =
		// webdriver.findElement(By.cssSelector("ul.nav_links li.destinations
		// li.nav_sublinks li.collinks4 a.button
		// a[href='https://www.amtrak.com/city-guides-dining-attractions-maps']"));
		// WebElement routebtn =
		// webdriver.findElement(By.cssSelector("div#nav_layer div#nav_sec
		// ul.nav_links li.destinations li.nav_sublinks li.collinks4 a.button
		// a[href='https://www.amtrak.com/city-guides-dining-attractions-maps']"));
		// routebtn.click();
		
		
	}

}
