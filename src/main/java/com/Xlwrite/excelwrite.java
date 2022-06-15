package com.Xlwrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class excelwrite {
	
	
	
WebDriver driver;
	
	//create string variables for hospital details
	String name[] = new String[10];
	

	private XSSFWorkbook workbook;
	
	public excelwrite(WebDriver driver) {
		this.driver = driver;
	}
	
    public void creatXl()  throws IOException {
    	
        //create list for 5 hospital details
		List<WebElement> li = driver.findElements(By.className("c-card-info"));
		System.out.println("Hospital at your location");
		System.out.println("***************************************************");
		for (int i = 0; i < 6; i++) {
			System.out.println(li.get(i).getText());
			name[i] = li.get(i).getText();
		}
		
		
		workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Hospital");
       
        
        //creating cell 
        int rownum = 0;
        Row row = sheet.createRow(rownum++);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hospital Details");
     
    
        
        //iterating through row and column
        rownum = 1;
	    for(int i=0;i<6;i++){
	         row = sheet.createRow(rownum++);
	             cell = row.createCell(0);
	            cell.setCellValue(name[i]);
	           
	        }
	    
	    //writing into the worksheet
        try (FileOutputStream outputStream = new FileOutputStream("writehospname.xlsx")) 
        {
            workbook.write(outputStream);
            System.out.println("***************************************************");
            System.out.println("written successfully into the excel worksheet");
            System.out.println("***************************************************");
        }
    }
	

}

