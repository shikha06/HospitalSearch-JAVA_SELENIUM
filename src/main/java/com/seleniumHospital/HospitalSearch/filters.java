package com.seleniumHospital.HospitalSearch;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageLoad.waitPageLoading;


public class filters {
WebDriver driver;


//creating object of waitPageLoading class
waitPageLoading wt;
	
	public filters(WebDriver driver) {
		this.driver = driver;
	}
	
	public void filter()
	{
		
	    //clicking 24*7 checkbox filter using xpath
		WebElement open24 = driver.findElement(By.xpath("//body//div[@id='container']//div//div[3]//label[1]//div[1]"));
		open24.click();
		load();
		
		
	}
	
	public void load() 
	{
		
		//calling pageload
		wt = new waitPageLoading(driver);
		wt.waitForPageLoad();
		
	}
	
}
