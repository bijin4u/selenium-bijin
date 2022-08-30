package mavenjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id='register_Layer']/div")).click();
		// active tab close
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
		
		//all tab close
		driver.quit();
	}

}
