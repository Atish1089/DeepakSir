package org.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	
	public static void takeScreenShot(ChromeDriver driver ) throws IOException
	{
		File file= driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("../YouTubeProject_Deepak_Sir/ScreenShots/screenshot_" + System.currentTimeMillis()+ ".jpg"));
	}
}
