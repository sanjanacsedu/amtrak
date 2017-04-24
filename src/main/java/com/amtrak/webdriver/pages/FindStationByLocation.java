package com.amtrak.webdriver.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindStationByLocation {

  private WebDriver driver;

  /**
   * @param driver
   */
  public FindStationByLocation(WebDriver driver) {
    this.driver = driver;
  }

  public int findStationByLocation() {
    // WebDriverWait wait = new WebDriverWait(driver, 5);
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Destinations")));
    WebElement station = driver
        .findElement(By.cssSelector("div.navsec_layout ul.nav_links li.nav_desc.destinations"));
    station.click();
    WebElement userName = driver.findElement(By.cssSelector("#station_city"));
    userName.sendKeys("Sunnyvale");
    WebElement element = driver.findElement(By.cssSelector("select[id='station_state']"));
    element.sendKeys("California");
    WebElement search = driver.findElement(By.id("station_search_city"));
    search.click();
    // WebElement element = driver.findElement(By.linkText("Destinations"));
    // element.click();
    List<WebElement> myElements2 = driver.findElements(By.cssSelector("div.search_results_list"));
    System.out.println("-------search result--------" + myElements2.size());
    List<WebElement> myElements3 = driver.findElements(By.className("result_miles"));
    int total = myElements3.size();
    // System.out.println("tttttt"+myElements3.get(0));
    System.out.println("tttttt" + myElements3.size());

    for (WebElement e : myElements3) {


      // titleList.add(e.getText());
      System.out.println(e.getText());


    }


    // System.out.println("myElements2.get(0)"+myElements2.iterator().);
    ArrayList<String> titleList = new ArrayList<String>();
    int count = 0;
    for (WebElement e : myElements2) {

      count++;
      // titleList.add(e.getText());
      System.out.println(e.getText());


    }
    System.out.println("inside" + count);
    return total;

  }

}
