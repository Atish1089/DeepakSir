package org.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

public static void dropDownHandling(WebElement element, int index)
	{
		Select sc = new Select(element) ;
		sc.selectByIndex(index);
	}
	
	public static void visibleText(String text , WebElement element)
	{
		
		Select sc = new Select(element) ;
		sc.selectByVisibleText(text);
	}


}
