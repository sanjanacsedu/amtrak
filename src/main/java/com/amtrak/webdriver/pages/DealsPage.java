package com.amtrak.webdriver.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DealsPage {
	private final WebDriver webdriver;

	public DealsPage(WebDriver driver) {
		webdriver = driver;
	}

	/*
	 * 1.go to homepage and select deals drop down page from homepage 2.select
	 * deals 3.click on california button 4.count the number of deals in
	 * california, it should be more than 5
	 */
	public void getStations(int zipcode) {
		WebElement dealsdropdown = webdriver.findElement(By.cssSelector("div.navsec_layout ul.nav_links li.deals"));
		dealsdropdown.click();
		WebElement dealsbtn = webdriver.findElement(By.cssSelector("a[href='https://www.amtrak.com/deals']"));
		dealsbtn.click();
		WebElement calbtn = webdriver.findElement(By.cssSelector("a[href='/deals-california'] div.calink"));
		calbtn.click();
	    webdriver.get("https://www.amtrak.com/deals-california");
		List<WebElement> stationEles = webdriver.findElements(By.cssSelector("div#CAdelas_list ul.std_space li.news_release"));
		List<String> stationlist = new ArrayList();
		for (WebElement stationEle : stationEles) {
			String title = stationEle.findElement(By.className("std_space")).getText();
			stationlist.add(title);
			System.out.println(stationlist);
		}

	}
}
