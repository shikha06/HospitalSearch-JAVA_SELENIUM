package com.seleniumHospital.HospitalSearch;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.pageLoad.waitPageLoading;

public class searchKeyword {
	
WebDriver driver;


//creating object of waitPageLoading class
waitPageLoading wt;
	
	public searchKeyword(WebDriver driver) {
		this.driver = driver;
	}
	
	public void search()
	{
		
    
		//sending keyword to the search box
		WebElement drp = driver.findElement(By.xpath("//input[@placeholder='Search doctors, clinics, hospitals, etc.']"));
		drp.sendKeys("hospital");
		load();
		//clicking on suggestion of the above keyword
		WebElement search = driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[@class='content']/div[@class='c-omni-wrapper u-d__inline-block']/div[@id='c-omni-container']/div[@class='c-omni u-clearfix']/div[@class='c-omni__wrapper u-clearfix c-omni__wrapper--keyword']/div[@class='c-omni-suggestion-list']/div[1]/div[1]"));
		search.click();
		load();

	}
	

	public void load() 
	{
		
		//calling pageload
		wt = new waitPageLoading(driver);
		wt.waitForPageLoad();
		
	}
	
	
	
}
