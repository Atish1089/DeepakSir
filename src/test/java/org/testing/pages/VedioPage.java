package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VedioPage {

    ChromeDriver driver;
    Properties pro;

    public VedioPage(ChromeDriver driver, Properties pro) {

        this.driver = driver;
        this.pro = pro;
    }
    public void playVedio() throws InterruptedException {
        driver.findElement(By.cssSelector(pro.getProperty("playFirstVedio"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(pro.getProperty("likeButton"))).click();
        Thread.sleep(1000);
    }

    public void subscribeChannel() {
        driver.findElement(By.xpath(pro.getProperty("subscribeChannel"))).click();
    }


    public void commentOnVedio() throws InterruptedException {
        Actions ac = new Actions(driver);
        for (int i = 0; i < 10; i++) {
            ac.sendKeys(Keys.ARROW_DOWN).perform();
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("commentLocator"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("commentLocator"))).sendKeys("commentOnVedio");
        driver.findElement(By.xpath(pro.getProperty("commnetButtonLocator"))).click();
        Thread.sleep(2000);
    }
}