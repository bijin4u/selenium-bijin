package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getdatafromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//find the excel workbook
		FileInputStream fi =new FileInputStream(".\\src\\test\\resources\\testdata\\TD.xlsx");
		Workbook w =new XSSFWorkbook(fi);
		//find the sheet
		Sheet s =w.getSheet("Sheet1");
		
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		
		for (int i = 1; i <=3; i++) {
			
		
		//find row
		Row r =s.getRow(i);
		
		//find column
		Cell c =r.getCell(0);
		Cell p =r.getCell(1);
		
		
		System.out.println(c.getStringCellValue());
		
		driver.findElement(By.id("email")).sendKeys(c.getStringCellValue());
		driver.findElement(By.id("pass")).sendKeys(p.getStringCellValue());
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).clear();
		}

	}

}
