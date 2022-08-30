package mavenjava;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/index_justrecharge.aspx");
		driver.findElement(By.id("jriTop_signin9")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("txtUserName")).sendKeys("bijin");
		driver.findElement(By.id("txtPasswd")).sendKeys("bijin123");
		//scanner
		Scanner s =new Scanner(System.in);
		System.out.println("enter the captcha");
		String b =s.next();
		
		driver.findElement(By.id("txtCaptcha")).sendKeys(b);
		
		//clear data
		
		driver.findElement(By.id("txtCaptcha")).clear();
		driver.quit();
		
		

	}

}
