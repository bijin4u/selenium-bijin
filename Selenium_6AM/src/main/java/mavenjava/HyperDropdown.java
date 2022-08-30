package mavenjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		//WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//HYPERLINK
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		//ENTRY
		driver.findElement(By.name("firstname")).sendKeys("bijin");
		driver.findElement(By.name("lastname")).sendKeys("mathew");
		driver.findElement(By.name("reg_email__")).sendKeys("9495302684");
		driver.findElement(By.name("reg_passwd__")).sendKeys("bijin@123");
		//DROP DOWN
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("12");
		
		

	}

}
