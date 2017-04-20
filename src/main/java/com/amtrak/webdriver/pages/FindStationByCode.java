package com.amtrak.webdriver.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindStationByCode {

  private WebDriver driver;

  /**
   * @param driver
   */
  public FindStationByCode(WebDriver driver) {
    this.driver = driver;
  }

  public String findStationByCode() {
    // WebDriverWait wait = new WebDriverWait(driver, 5);
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Destinations")));
    WebElement station = driver
        .findElement(By.cssSelector("div.navsec_layout ul.nav_links li.nav_desc.destinations"));
    station.click();
    WebElement station_code = driver.findElement(By.id("container2_btn"));
    station_code.click();
    WebElement sendCode = driver.findElement(By.id("code"));
    sendCode.sendKeys("ACD");
    WebElement search = driver.findElement(By.className("searchbycode_btn"));
    search.click();
    WebElement title = driver.findElement(By.cssSelector("div.station_details h3"));
    String result = title.getText();
    return result;

  }

}

