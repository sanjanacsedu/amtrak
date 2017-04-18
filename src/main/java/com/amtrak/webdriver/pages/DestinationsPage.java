package com.amtrak.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DestinationsPage {
	private final WebDriver webdriver;

	  public DestinationsPage(WebDriver driver) {
	    webdriver = driver;
	  }
	
	//public List<String> getStations(int zipcode){}
	
	public void getrouteMap() {
		//WebElement routebtn = webdriver.findElement(By.cssSelector("ul.nav_links li.destinations li.nav_sublinks li.collinks4 a.button a[href='https://www.amtrak.com/city-guides-dining-attractions-maps']"));
		WebElement routebtn = webdriver.findElement(By.cssSelector("div#nav_layer div#nav_sec ul.nav_links li.destinations li.nav_sublinks li.collinks4 a.button a[href='https://www.amtrak.com/city-guides-dining-attractions-maps']"));
		
		routebtn.click();
	}

}
