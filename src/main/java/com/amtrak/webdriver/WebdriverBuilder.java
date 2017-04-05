package com.amtrak.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBuilder {
  private static WebDriver driver = null;

  public static WebDriver getDriver() {

    String requestedBrowser = System.getProperty("browser");
    System.out.println(requestedBrowser);

    if (driver == null) {

      if ("chrome".equals(requestedBrowser)) {
        driver = newChromeDriver();
      }

      else if ("firefox".equals(requestedBrowser)) {

        driver = newFirefoxDriver();
      }

      else {
        driver = newChromeDriver();
      }

      /*
       * System.setProperty("webdriver.chrome.driver",
       * "//Users/nafiurrashid/Desktop/selenium/chromedriver"); driver = new ChromeDriver();
       */
      /*
       * System.setProperty("webdriver.gecko.driver",
       * "//Users/nafiurrashid/Desktop/selenium/geckodriver"); driver = new FirefoxDriver();
       */

    }
    return driver;
  }

  private static WebDriver newChromeDriver() {
    System.setProperty("webdriver.chrome.driver",
        "//Users/nafiurrashid/Desktop/selenium/chromedriver");
    WebDriver webDriver = new ChromeDriver();
    return webDriver;

  }

  private static WebDriver newFirefoxDriver() {
    System.setProperty("webdriver.gecko.driver",
        "//Users/nafiurrashid/Desktop/selenium/geckodriver");
    WebDriver webDriver = new FirefoxDriver();
    // webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // webDriver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

    return webDriver;

  }
}
