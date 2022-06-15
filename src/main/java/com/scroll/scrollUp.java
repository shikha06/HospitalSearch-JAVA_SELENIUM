package com.scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.pageLoad.waitPageLoading;

public class scrollUp {
	
WebDriver driver;
waitPageLoading wt;

	
	public scrollUp(WebDriver driver) {
		this.driver = driver;
	}
	
	//calling the scroll up function for the window
	public void scrollup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		 load();
	}
	
	
	
	public void load() 
	{
		
		//calling pageload
		wt = new waitPageLoading(driver);
		wt.waitForPageLoad();
		
	}

}
