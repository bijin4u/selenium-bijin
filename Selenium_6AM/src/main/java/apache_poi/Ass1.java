package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fi =new FileInputStream("C:\\Users\\Administrator\\Desktop\\SeleniumWorkspace\\Selenium_6AM\\src\\test\\resources\\testdata\\SEARCH.xlsx");
		Workbook w =new XSSFWorkbook(fi);
		Sheet s =w.getSheet("25");
		//Row r =s.getRow(1);
		//Cell c =r.getCell(0);
		//System.out.println(c.getStringCellValue());
		
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart-prf.exense.ch/");
		for (int i = 1; i <=3; i++) {
			
			Row r =s.getRow(i);
			Cell c =r.getCell(0);
			System.out.println(c.getStringCellValue());
			
		
		driver.findElement(By.name("search")).sendKeys(c.getStringCellValue());
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("search")).clear();
		}	

	}

}
