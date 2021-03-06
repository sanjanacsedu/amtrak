package com.amtrak.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.amtrak.webdriver.pages.AmtrakHomePage;
import com.amtrak.webdriver.pages.AmtrakLoginPage;
import com.amtrak.webdriver.pages.DealsPage;
import com.amtrak.webdriver.pages.DestinationsPage;

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
  /*@Test
  public void verifyTitleWithoutLogin() {
    AmtrakHomePage homePage = new AmtrakHomePage(driver);
    homePage.load();
    String title = homePage.getTitle();
    Assert.assertEquals("Train & Bus Tickets - National Railroad - USA & Canada | Amtrak", title);
  }

  // This test case will find the deals of California using deals page

  @Test
  public void getDealsCount() {
    AmtrakHomePage homePage = new AmtrakHomePage(driver);
    homePage.load();
    DealsPage dealspage = new DealsPage(driver);
    List<String> stationlist = new ArrayList();
    List<String> assertlist = new ArrayList();
    stationlist = dealspage.getStations(95129);
    Assert.assertTrue(stationlist.size() > 5);

  }

  @Test
  public void openRoutemap() {
    AmtrakHomePage homePage = new AmtrakHomePage(driver);
    homePage.load();
    DestinationsPage destpage = new DestinationsPage(driver);
    destpage.getrouteMap();
  }*/

  @Test
 public void loginAmtrak() {
	  AmtrakLoginPage loginpage = new AmtrakLoginPage(driver);
	  loginpage.login("reslogin","email2sudha@yahoo.com", "Musgrav1te~");
	  
  }
	  
  }


