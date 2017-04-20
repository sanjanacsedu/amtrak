package com.amtrak.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.amtrak.webdriver.pages.AmtrakHomePage;
import com.amtrak.webdriver.pages.FindStationByCode;
import com.amtrak.webdriver.pages.FindStationByLocation;
import com.amtrak.webdriver.pages.LanguagesPage;

public class VerifySearchStationByCodeTest {
  public WebDriver driver;

  /**
   * 
   */
  public VerifySearchStationByCodeTest() {
    // TODO Auto-generated constructor stub
    driver = WebdriverBuilder.getDriver();
  }

  @Before
  public void setup() {
    driver.manage().deleteAllCookies();

  }

  @Test
  public void verifySearchStationBycode() {
    AmtrakHomePage homePage = new AmtrakHomePage(driver);
    homePage.load();
    FindStationByCode station = new FindStationByCode(driver);
    String result = station.findStationByCode();
    Assert.assertEquals("Arcadia Valley Station", result);

  }



}
