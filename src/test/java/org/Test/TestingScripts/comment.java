package org.Test.TestingScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class comment {
	static WebDriver driver;

public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
	System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.youtube.com/");
    Options open = driver.manage();
    Window win = open.window();
    win.maximize();
//	driver.findElement(By.xpath("//div[@id='buttons']//tp-yt-paper-button[@id='button']")).click();
//    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jvselenium@gmail.com");
//    driver.findElement(By.xpath("//span[text()='Next']")).click();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("namritatish");
//    driver.findElement(By.xpath("//span[text()='Next']")).click();
//    Thread.sleep(3000);
    driver.findElement(By.cssSelector("div [id = 'video-title-link']")).click();
    Thread.sleep(3000);
    Actions ac = new Actions(driver);
    for (int i=0 ; i<10 ; i++)
    {
    ac.sendKeys(Keys.ARROW_DOWN).perform();
    }
    
    Thread.sleep(2000);
  //driver.findElement(By.xpath("//div[@id='placeholder-area']")).click();
// Properties pro = new Properties();
//pro.load(new FileInputStream("../YTFramework/message.properties"));
 //String commentOnVideo = pro.getProperty("commentOnVideo");
//Thread.sleep(5000);
driver.findElement(By.cssSelector("div#placeholder-area")).sendKeys("good");
//driver.findElement(By.xpath("//div[@id='placeholder-area']")).sendKeys(commentOnVideo);
    //element.sendKeys("This is the best vedio ");
    //driver.findElement(By.xpath("//tp-yt-paper-button[@aria-label='Comment']")).click();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
//    Thread.sleep(3000);
//    List < WebElement > allLabelElements = driver.findElements(By.xpath("//yt-formatted-string[@id='label']"));
//    int countOFLabels = allLabelElements.size();
//    for (int i = 0; i < countOFLabels; i++) {
//      String allLabelNames = allLabelElements.get(i).getText(); {
//        if (allLabelNames.equalsIgnoreCase("Sign out")) {
//         Thread.sleep(1000);
//        	allLabelElements.get(i).click();
//          break;
}
}
//}}}