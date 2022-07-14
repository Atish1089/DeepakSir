package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.Test.Assertions.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;
    Properties pro;


    public HomePage(ChromeDriver driver, Properties pro) {
        this.driver = driver;
        this.pro = pro;

    }
    public void clickOnExploreButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("linkExplore"))).click();
    }
    public void clickOnTrendingButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("linkTrending"))).click();
    }

    public void clickOnHomePageTabs(String tab)
    {
    	List < WebElement > allTabNames = driver.findElements(By.xpath(pro.getProperty("linksTab")));
        int countOfAllTabs = allTabNames.size();
        for (int i = 0; i < countOfAllTabs; i++) {
        	Assertion.elementPresent(allTabNames.get(i));
        	String namesAllTabs = allTabNames.get(i).getText();
          if (namesAllTabs.equalsIgnoreCase(tab)) {
            allTabNames.get(i).click();
            break;
          }
        }    	    	
    }
}