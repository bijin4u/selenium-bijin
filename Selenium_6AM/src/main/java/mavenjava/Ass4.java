package mavenjava;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tirupatibalaji.ap.gov.in");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//HYPER
		driver.findElement(By.linkText("Sign Up")).click();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("fName")).sendKeys("Bijin");
		driver.findElement(By.name("lName")).sendKeys("Mathew");
		driver.findElement(By.name("mobNo")).sendKeys("9495302684");
		driver.findElement(By.name("address1")).sendKeys("kmbhm");
		driver.findElement(By.name("address2")).sendKeys("klngra");
		driver.findElement(By.name("cityS")).sendKeys("adoor");
		driver.findElement(By.name("zipCode")).sendKeys("691523");
		driver.findElement(By.id("proofid")).sendKeys("h65254");
		driver.findElement(By.name("emailId")).sendKeys("bijin4u@gmail.com");
		driver.findElement(By.name("password")).sendKeys("AS562df");
		driver.findElement(By.name("repassword")).sendKeys("AS562df");
		//DROPDOWN
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
		new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Kerala");
		new Select(driver.findElement(By.name("proofS"))).selectByVisibleText("Aadhaar Card ");
		
		//driver.findElement(By.id("txtInput")).sendKeys("52h56");
		Scanner s =new Scanner(System.in);
		System.out.println("enter the captcha");
		String cap =s.next();
		driver.findElement(By.id("txtInput")).sendKeys(cap);
		
	}

}
