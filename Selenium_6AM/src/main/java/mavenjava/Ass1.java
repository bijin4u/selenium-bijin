package mavenjava;

import java.sql.Driver;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("test4@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("267952");
		// captcha entering by scanner
		Scanner s =new Scanner(System.in);
		System.out.println("enter the captcha no");
		String captcha =s.next();
		driver.findElement(By.id("txtCaptcha")).sendKeys(captcha);
		driver.findElement(By.id("imgbtnSignin")).click();
	}

}
