package com.amtrak.webdriver.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TicketsPage {


  private WebDriver driver;
  private int today;

  /**
   * @param driver
   */
  public TicketsPage(WebDriver driver) {
    this.driver = driver;
  }

  public int verifyAvailableTicket() {

    WebElement from = driver.findElement(By.id("departs"));
    from.sendKeys("Anaheim, CA (ANA)");
    WebElement to = driver.findElement(By.id("arrives"));
    to.sendKeys("Arcadia, MO (ACD)");
    WebElement calendarPopup = driver.findElement(By.id("calLink1"));
    calendarPopup.click();
    WebElement calendar = driver.findElement(By.cssSelector("table.ui-datepicker-calendar"));
    List<WebElement> columns = calendar.findElements(By.tagName("td"));

    // LocalDateTime.from(dt.toInstant()).plusDays(1);
    LocalDate localDate = LocalDate.now().plusDays(1);
    System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
    String dat = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);
    String[] parts = dat.split("/");
    today = localDate.getDayOfMonth();


    // DatePicker is a table. Thus we can navigate to each cell
    // and if a cell matches with the current date then we will click it.
    for (WebElement cell : columns) {
      /*
       * //If you want to click 18th Date if (cell.getText().equals("18")) {
       */
      if (cell.getText().equals(parts[2])) {
        cell.click();
        break;
      }
    }

    WebElement search = driver.findElement(By.id("findtrains"));
    search.click();
    return 0;

  }

}

