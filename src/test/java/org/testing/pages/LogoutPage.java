package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {

    ChromeDriver driver;
    Properties pro;
    public LogoutPage(ChromeDriver driver, Properties pro) {
        this.driver = driver;
        this.pro = pro;
    }
    public void logoutAccountAllTabs(String tab) throws InterruptedException {
    	driver.findElement(By.xpath(pro.getProperty("profilePhoto"))).click();
        List < WebElement > allLabelElements = driver.findElements(By.xpath(pro.getProperty("profilePhotoDropdownAllElements")));
        int countOFLabels = allLabelElements.size();
        for (int i = 0; i < countOFLabels; i++) {
            String allLabelNames = allLabelElements.get(i).getText(); {
                if (allLabelNames.equalsIgnoreCase(tab)) {
                    Thread.sleep(500);
                    allLabelElements.get(i).click();
                    break;
                }
            }
        }
    }
}