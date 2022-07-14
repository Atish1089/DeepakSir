package org.Test.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClassIncognitoMode {

	WebDriver driver ; 
	ChromeOptions co = new ChromeOptions();
	public void browserOpen() 
	{
		driver = new ChromeDriver() ; 
	
	}
	
	
	
	
	
	
}
