package com.amtrak.webdriver.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LanguagesPage {
  private WebDriver driver;

  /**
   * @param driver
   */
  public LanguagesPage(WebDriver driver) {
    this.driver = driver;
  }
//  mvn -Dtest=#languageSelection test  
  public String languageSelection() {
    WebElement element = driver.findElement(By.cssSelector("select[id='language_select']"));
    element.sendKeys("Deutsch");
    List<WebElement> myElements = driver.findElements(By.cssSelector("select[id='language_select']"));
    for (WebElement e : myElements)
      System.out.println(e.getText());

    element.sendKeys("Deutsch");
    /*
     * try { Thread.sleep(5000); } catch (InterruptedException e1) { // TODO Auto-generated catch
     * block e1.printStackTrace(); }
     */
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Einloggen")));
    // WebElement linkElement = driver.findElement(By.linkText("Einloggen"));
    WebElement linkElement = driver.findElement(By.partialLinkText("Einloggen"));
    return linkElement.getText();
  }

}
