package com.seleniumHospital.HospitalSearch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pageLoad.waitPageLoading;
public class locate {
	
	
WebDriver driver;


//creating object of waitPageLoading class
waitPageLoading wt;
	
	public locate(WebDriver driver) {
		this.driver = driver;
	}
	
	public void locate1()
	{
		//automating auto-location detector
		driver.findElement(By.className("icon-ic_gps_system")).click();
		load();
			
	}
	
	
	

	public void load() 
	{
		
		//calling pageload
		wt = new waitPageLoading(driver);
		wt.waitForPageLoad();
		
	}
	
	}
	
	


