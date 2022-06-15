package com.selenium.drivercls;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageLoad.waitPageLoading;

public class logout {
	
	
	
	
	WebDriver driver;

	//creating object of waitPageLoading class
	waitPageLoading wt;
		
		public logout(WebDriver driver) {
			this.driver = driver;
			
		}
		
		public void logout1()
		{
			
			
			//clicking on the dropdown arrow sign
			driver.findElement(By.xpath("//span[@class='up-triangle']//span[@class='downarrow icon-ic_down_cheveron']")).click();
			load();

			
		
			//logout the window
			driver.findElement(By.xpath("//div[@class='u-d nav-dropdown text-left active-state']//a[@class='nav-interact logout-click'][contains(text(),'Logout')]")).click();
			load();
			
			System.out.println("*********************************************");
			System.out.println("Signing out from the website");
			
			
		}
		

		public void load() 
		{
			
			//calling pageload method
			wt = new waitPageLoading(driver);
			wt.waitForPageLoad();
			
		}

		

}
