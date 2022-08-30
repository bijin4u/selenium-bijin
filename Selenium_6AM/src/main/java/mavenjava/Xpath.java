package mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
		//xpath
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		//xpath index
		driver.findElement(By.xpath("(//input[@value ='Choose This Flight'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder ='First Last']")).sendKeys("bijin");
		driver.findElement(By.xpath("//input[@name ='address']")).sendKeys("kumbham");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("mannady");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("kerala");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("68235");
		new Select(driver.findElement(By.xpath("//select[@class='form-inline']"))).selectByVisibleText("Diner's Club");
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("25647589562");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).clear();
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("4");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("2022");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("bijin mathew");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}

}
