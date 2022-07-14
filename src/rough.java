import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
public class rough {
	public ChromeDriver driver;
	  public Properties pro = new Properties();

	public void openBrowser() throws IOException {
	    
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
	    driver = new ChromeDriver();
	    Actions action = new Actions(driver);
	    driver.get("https://mobile-recruit.com/register?q=LVmtPteE");
	    
	    Options open = driver.manage();
	    Window win = open.window();
	    win.maximize();
	    action.sendKeys(Keys.TAB).perform();
	    action.sendKeys(Keys.TAB).perform();
	    action.sendKeys(Keys.TAB).perform();
	    action.sendKeys(Keys.TAB).perform();
	    action.sendKeys(Keys.TAB).perform();
	   
	    
	    
	    WebElement element = driver.findElement(By.cssSelector("label[for='checkbox-terms']"));
	    
	    
	    //driver.findElement(By.cssSelector("label[class='css-label radGroup1']")).click();
	   
	  
	  //Used points class to get x and y coordinates of element.
	  Point point = element.getLocation();
	  int xcord = point.getX();
	  System.out.println("Position of the webelement from left side is "+xcord +" pixels");
	  int ycord = point.getY();
	  System.out.println("Position of the webelement from top side is "+ycord +" pixels");
	  // Using Actions class
	                  //Actions action = new Actions(driver);
	                  //clicking on the logo based on x coordinate and y coordinate
	                  //you will be redirecting to the home page of softwaretestingmaterial.com
	                  action.moveToElement(element, xcord, ycord).click().build().perform();
	                 /*((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+element.getLocation().y+")");
	                 element.click();*/
	                 /*JavascriptExecutor executor = (JavascriptExecutor) driver;
	                 executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
	                 executor.executeScript("arguments[0].click();", element);*/
	 
	
	
	}
	  
	
	public static void main(String[] args) throws IOException {
		
		rough r = new rough();
		r.openBrowser();
	}
	
	}

