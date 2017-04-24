package com.amtrak.webdriver.pages;

import org.openqa.selenium.WebDriver;

public class AmtrakHomePage {

  private WebDriver driver;

  /**
   * @param driver
   */
  public AmtrakHomePage(WebDriver driver) {
    super();
    this.driver = driver;
  }

  public void load() {
    driver.get("https://www.amtrak.com/home");
  }

  public String getTitle() {
    return driver.getTitle();
  }

  /*
   * public AmtrakLoginPage logIn(String uname, String pwd) { return loginpage; }
   */
}
