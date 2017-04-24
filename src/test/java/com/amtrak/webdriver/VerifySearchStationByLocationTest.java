package com.amtrak.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.amtrak.webdriver.pages.AmtrakHomePage;
import com.amtrak.webdriver.pages.FindStationByLocation;
import com.amtrak.webdriver.pages.LanguagesPage;

public class VerifySearchStationByLocationTest {
  public WebDriver driver;

  /**
   * 
   */
  public VerifySearchStationByLocationTest() {
    // TODO Auto-generated constructor stub
    driver = WebdriverBuilder.getDriver();
  }

  @Before
  public void setup() {
    driver.manage().deleteAllCookies();
  }

  @Test
  public void verifySearchStationByLocation() {
    AmtrakHomePage homePage = new AmtrakHomePage(driver);
    homePage.load();
    FindStationByLocation station = new FindStationByLocation(driver);
    int count = station.findStationByLocation();
    Assert.assertEquals(5, count);

  }



}
