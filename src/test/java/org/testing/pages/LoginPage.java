package org.testing.pages;

import java.util.Properties;

import org.Utilities.Logs4j;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    ChromeDriver driver;
    Properties pro;
    public LoginPage(ChromeDriver driver, Properties pro) {
        this.driver = driver;
        this.pro = pro;

    }
    public void signIn(String userName, String password) throws InterruptedException

    {
        driver.findElement(By.xpath(pro.getProperty("buttonYouTubeSignIn"))).click();
        driver.findElement(By.xpath(pro.getProperty("emailInputBox"))).sendKeys(userName);
        Logs4j.loggs("signIn", "there are errors");
        driver.findElement(By.xpath(pro.getProperty("buttonNext"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(pro.getProperty("passwordInputBox"))).sendKeys(password);
        driver.findElement(By.xpath(pro.getProperty("buttonNext"))).click();
        Thread.sleep(2000);
    }
}