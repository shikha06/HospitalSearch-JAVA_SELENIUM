package com.selenium.drivercls;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*********************************************************************************************************/
import com.Xlwrite.excelwrite;
import com.clientDetail.personalDetail;
import com.screenshotpage.screenshot;
import com.scroll.scrollUp;
import com.selenium.drivercls.login;
import com.selenium.drivercls.logout;
import com.seleniumHospital.HospitalSearch.filterdrop1;
import com.seleniumHospital.HospitalSearch.filters;
import com.seleniumHospital.HospitalSearch.locate;
import com.seleniumHospital.HospitalSearch.searchKeyword;


public class driver {
	
	
WebDriver driver;
login obj;
locate loc;
searchKeyword sear;
filters fil;
filterdrop1 drop; 
excelwrite xl1;
screenshot screens;
scrollUp sc;
personalDetail pd;
logout lgot;
	
	@Parameters("browser")
	
	@BeforeClass
	public void setup(String browser) {
		System.out.println(browser);
		
		//3 browsers are used  here
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver1.exe");

			driver = new ChromeDriver();
		} 
		else {
			
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//maximizing the window
		driver.manage().window().maximize();

		
		//calling practo website
		driver.get("https://www.practo.com/");
		
		
		//verifying homepage title using assertion
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertTrue(title.contains("Practo | Book Doctor Appointments Online, Order Medicine, Diagnostic Tests, Consult" ));
	}

	@Test
	public void verifylogin() throws IOException 
	{
		
		//calling login method to click on login button
		obj = new login(driver);
		obj.login1();
		
	

		//calling location method to click on autolocate button
		loc = new locate(driver);
		loc.locate1();
		
	
		
		//enter keyword and search it
		sear = new searchKeyword(driver);
		sear.search();
		
	
		
		//calling filter checkbox 
		fil = new filters(driver);
		fil.filter();
		
	
		//calling dropdown and checkbox filter
		drop = new filterdrop1(driver);
		drop.filterdrop();
	
		//taking screenshot of the whole page after fulfilling all the conditions 
		screens = new screenshot(driver);
		screens.screens();
		
	
		//writing the details of the hospital in excel
		xl1 = new excelwrite(driver);
		xl1.creatXl();
	
		
		//scrolling up the webpage
		sc = new scrollUp(driver);
		sc.scrollup();
	
		
		//testing rest of the elements
		pd = new personalDetail(driver);
		pd.details();
	
		
		//signing out the webpage
		lgot = new logout(driver);
		lgot.logout1();
	}
	
	
	@AfterClass
	public void stop() {
		driver.quit();
	}
	
	

}
