package com.shiftedtech.September01;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GoogleTest extends Google {
 
   @Test	
   public void test01() {
	   
   
	WebElement element=driver.findElement(By.name("q"));
	element.sendKeys("32 degree celsius to fahrenheit");
	Actions action= new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li[1]/div[1]/div/span")));
	action.click();
	action.perform();
	
}	
	
}
