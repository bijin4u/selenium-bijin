package mavenjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create web driver object
		WebDriver driver;
		
		//web driver manager to open chrome browser
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
				
		
		//maximize
		driver.manage().window().maximize();
		
		//open fb
		driver.get("https://www.facebook.com/login/");
		
		//UM & PASSWORD
		//driver.findElement(By.id("email")).sendKeys("testmail@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("9546243");
		
		//login
		//driver.findElement(By.id("loginbutton")).click();
		
		d]river.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//hyperlink
		driver.findElement(By.linkText("Forgotten account?")).click();
		
			
	}

}
