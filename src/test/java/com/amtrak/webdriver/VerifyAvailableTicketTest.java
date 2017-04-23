package com.amtrak.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.amtrak.webdriver.pages.AmtrakHomePage;
import com.amtrak.webdriver.pages.FindStationByLocation;
import com.amtrak.webdriver.pages.LanguagesPage;
import com.amtrak.webdriver.pages.TicketsPage;

public class VerifyAvailableTicketTest {
  public WebDriver driver;

  /**
   * 
   */
  public VerifyAvailableTicketTest() {
    // TODO Auto-generated constructor stub
    driver = WebdriverBuilder.getDriver();
  }

  @Before
  public void setup() {
    driver.manage().deleteAllCookies();

  }

  @Test
  public void verifyAvailableTicket() {
    AmtrakHomePage homePage = new AmtrakHomePage(driver);
    homePage.load();
    TicketsPage station = new TicketsPage(driver);
    int count = station.verifyAvailableTicket();
    Assert.assertEquals(0, count);
  }



}
