package com.pageLoad;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class waitPageLoading {
	
WebDriver driver;

	
	public waitPageLoading(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//using javascriptexecutor for pageload
	public void waitForPageLoad() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		int i =0;
		while(i!= 180) {
			String pageState = (String)js.executeScript("return document.readyState;");
			if(pageState.equals("complete"))
				break;
			else
				waitLoad(1);	
		}
		
		waitLoad(2);
	}
	public void waitLoad(int i) {
		try {
			Thread.sleep(i * 1000);
		}catch(InterruptedException e) {
			
		}

}
}
