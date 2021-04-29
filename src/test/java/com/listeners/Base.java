package com.listeners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static void Initialization(){

		System.setProperty("webdriver.chrome.driver", "E:\\STUDY Mate\\SELENIUM\\Jar's & Software\\webDriver Chrome\\ChromeDriver 88\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");			
	}

	public void ScreenShotUtility(String MethodName) {

		File Src  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Src, new File("C:\\Users\\prate\\workspace\\TestNGListeners\\Screenshot\\"+MethodName+"."+"jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
