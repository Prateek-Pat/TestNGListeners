package com.listeners;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class ScreenshotTest extends Base{
	
	
	@BeforeMethod
	public void setUp(){
		Base.Initialization();		
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();		
	}
	
	@Test
	public void LoginPage(){	
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void HomePage(){	
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void ContactPage(){	
		Assert.assertEquals(false, true);
	}
}


