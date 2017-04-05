package com.amtrak.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.amtrak.webdriver.pages.AmtrakHomePage;

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

  @Test
  public void verifyTitleWithoutLogin() {
    AmtrakHomePage homePage = new AmtrakHomePage(driver);
    homePage.load();
    String title = homePage.getTitle();
    Assert.assertEquals("Train & Bus Tickets - National Railroad - USA & Canada | Amtrak", title);
  }


}

