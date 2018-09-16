package com.shiftedtech.September01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Google {
    WebDriver driver;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "/Users/mdislam/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(030, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
	}
	
	@AfterMethod
	public void teardown() { 
	//driver.close();
	
	}
}
