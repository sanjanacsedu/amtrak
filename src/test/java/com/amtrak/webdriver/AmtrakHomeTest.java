package com.amtrak.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.amtrak.webdriver.pages.AmtrakHomePage;
import com.amtrak.webdriver.pages.DealsPage;

public class AmtrakHomeTest {

  public WebDriver driver;

  public AmtrakHomeTest() {
    // TODO Auto-generated constructor stub
    driver = WebdriverBuilder.getDriver();
  }

  @Before
  public void setup() {
    driver.manage().deleteAllCookies();

  }
  // This test case will automate the homepage title
  /*
   * @Test public void verifyTitleWithoutLogin() { AmtrakHomePage homePage = new
   * AmtrakHomePage(driver); homePage.load(); String title = homePage.getTitle();
   * Assert.assertEquals("Train & Bus Tickets - National Railroad - USA & Canada | Amtrak", title);
   * }
   */

  // This test case will find the deals of California using deals page
  /*
   * @Test public void getDealsCount() { AmtrakHomePage homePage = new AmtrakHomePage(driver);
   * homePage.load(); DealsPage dealspage = new DealsPage(driver); dealspage.getStations(95129); }
   */

  @Test
  public void verifyCaliforniaDealsCount() {
    AmtrakHomePage homePage = new AmtrakHomePage(driver);
    homePage.load();
    DealsPage dealspage = new DealsPage(driver);
    int totalDeals = dealspage.getCaliforniaDealCount();
    Assert.assertEquals(25, totalDeals);

  }
}

