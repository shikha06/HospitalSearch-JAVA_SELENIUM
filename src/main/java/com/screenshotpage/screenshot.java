package com.screenshotpage;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class screenshot {
	
	
	WebDriver driver;
	 
	public screenshot(WebDriver driver) {
		this.driver = driver;
	}
	 
public void screens() throws IOException {

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Object Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

ImageIO.write(((ru.yandex.qatools.ashot.Screenshot) Screenshot).getImage(), "jpg", new File("Screenshots\\screen.jpg"));
    System.out.println("***************************************************");
    System.out.println("screenshot taken and saved into the Screenshots folder");
	System.out.println("***************************************************");
	}
	

}





