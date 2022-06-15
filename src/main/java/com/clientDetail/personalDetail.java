package com.clientDetail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageLoad.waitPageLoading;

public class personalDetail {
	
	
	
	WebDriver driver;


	//creating object of waitPageLoading class
	waitPageLoading wt;
		
		public personalDetail(WebDriver driver) {
			this.driver = driver;
		}
		
		public void details()
		{
			
		    //clicking on the details of the client one by one 
			WebElement detail = driver.findElement(By.xpath("//span[@class='up-triangle']//span[@class='downarrow icon-ic_down_cheveron']"));
			detail.click();
			load();
			
			driver.findElement(By.xpath("//div[@class='u-d nav-dropdown text-left active-state']//a[@class='nav-interact'][contains(text(),'My Appointments')]")).click();
			load();
			
			driver.findElement(By.xpath("//div[contains(text(),'Lab Tests')]")).click();
			load();
			
			driver.findElement(By.xpath("//div[contains(text(),'Medicine Orders')]")).click();
			load();
			
			driver.findElement(By.xpath("//div[contains(text(),'Online Consultations')]")).click();
			load();
			
			driver.findElement(By.xpath("//div[contains(text(),'Articles')]")).click();
			load();
			
			driver.findElement(By.xpath("//div[contains(text(),'Feedback')]")).click();
			load();
			
			driver.findElement(By.xpath("//div[contains(text(),'Payments')]")).click();
			load();
			
			
			driver.findElement(By.xpath("//span[@class='practo-logo']//i[@class='practo_logo_new']")).click();
			load();
			
			
			
		}
		
		public void load() 
		{
			
			//calling pageload
			wt = new waitPageLoading(driver);
			wt.waitForPageLoad();
			
		}
		

}
