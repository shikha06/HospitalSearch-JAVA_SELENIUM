package com.selenium.drivercls;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
/*import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;*/
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageLoad.waitPageLoading;


public class login {
	
	
	
	
WebDriver driver;

//creating object of waitPageLoading class
waitPageLoading wt;
	
	public login(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void login1()
	{
		
		//reading properties file containing login credentials
		   FileReader reader = null;
		try {
			reader = new FileReader("config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		      
		    Properties p=new Properties();  
		    try {
				p.load(reader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		      
		    String user =  p.getProperty("username");  
		    String pwd  =  p.getProperty("password");
		
		
		//applying findElement on login button and click on the button
		driver.findElement(By.name("Practo login")).click();
		load();
		

		//verifying login page title using assertion
		
		String logtitle = driver.getTitle();
        Assert.assertEquals("Practo Accounts" , logtitle);
        System.out.println("Login page title is :"+logtitle);
		
		
		//sending login id and password into the textboxes
		driver.findElement(By.name("username")).sendKeys(user);
	
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		//unchecking the remember me checkbox
		
		driver.findElement(By.xpath("//div[@class='remember']//label")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("login")).click();
		
		
		
	}
	

	public void load() 
	{
		
		//calling pageload method
		wt = new waitPageLoading(driver);
		wt.waitForPageLoad();
		
	}

	
	
}
