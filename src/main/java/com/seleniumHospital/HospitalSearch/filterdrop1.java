package com.seleniumHospital.HospitalSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.pageLoad.waitPageLoading;

public class filterdrop1 {

	
WebDriver driver;


//creating object of waitPageLoading class
waitPageLoading wt;
	
	public filterdrop1(WebDriver driver) {
		this.driver = driver;
	}
	
	public void filterdrop()
	{	
		//clicking on the dropdown arrow
        driver.findElement(By.xpath("//i[@class='u-transition--transform u-d-inlineblock icon-ic_dropdown']")).click();
       
        //clicking on the has parking checkbox
		WebElement park = driver.findElement(By.xpath("//div[@class='c-filter__bottom expanded']//label[1]//div[1]"));
		park.click();
		load();
	}
	
	

	public void load() 
	{
		
		//calling pageload
		wt = new waitPageLoading(driver);
		wt.waitForPageLoad();
		
	}
	
	
}
