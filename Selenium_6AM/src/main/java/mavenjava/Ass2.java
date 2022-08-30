package mavenjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
		//wait
		//Thread.sleep(9000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("firstName")).sendKeys("bijin");
		driver.findElement(By.id("lastName")).sendKeys("mathew");
		driver.findElement(By.id("emailAddress")).sendKeys("bijin4u@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("9495302684");
		//dropdown
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("INDIA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		
		driver.findElement(By.id("password")).sendKeys("bijin123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("bijin123");
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		driver.findElement(By.id("submit")).click();
		
	}

}
