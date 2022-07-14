package org.Test.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


@SuppressWarnings("unused")
public class BaseClass {

  public ChromeDriver driver;
  public Properties pro = new Properties();
  public File obj = new File("../YTFramework/src/test/java/org/Test/Base/object.properties");

  
  @BeforeMethod
  public void openBrowser() throws IOException {
    
	System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
    driver = new ChromeDriver();
    FileReader fr = new FileReader(obj);
    pro.load(fr);
    driver.get("https://www.youtube.com/");
    Options open = driver.manage();
    Window win = open.window();
    win.maximize();

  }
//  @Parameters({"chromeBrowser","Production-Environmet"})
//  @BeforeMethod
//  public void openBrowser(String browser , String url) throws IOException {
//    
//	System.setProperty("webdriver.chrome.driver", browser);
//    driver = new ChromeDriver();
//    FileReader fr = new FileReader(obj);
//    pro.load(fr);
//    driver.get(url);
//    Options open = driver.manage();
//    Window win = open.window();
//    win.maximize();
//
//  }

  @AfterMethod
  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.close();

  }
}