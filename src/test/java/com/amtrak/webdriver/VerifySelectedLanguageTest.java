package com.amtrak.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.amtrak.webdriver.pages.AmtrakHomePage;
import com.amtrak.webdriver.pages.LanguagesPage;

public class VerifySelectedLanguageTest {

  public WebDriver driver;

  public VerifySelectedLanguageTest() {
    // TODO Auto-generated constructor stub
    driver = WebdriverBuilder.getDriver();
  }

  @Before
  public void setup() {
    driver.manage().deleteAllCookies();

  }
// This test case will automate the homepage title
  //mvn -Dtest=#verifySelectedLanguageLoginButton test 
  @Test
  public void verifySelectedLanguageLoginButton() {
    AmtrakHomePage homePage = new AmtrakHomePage(driver);
    homePage.load();
   // String title = homePage.getTitle();
    //Assert.assertEquals("Train & Bus Tickets - National Railroad - USA & Canada | Amtrak", title);
    LanguagesPage lang = new LanguagesPage(driver);
    String languageLogin = lang.languageSelection();
    Assert.assertEquals("Einloggen", languageLogin);
    //Assert.ass
  }


}

