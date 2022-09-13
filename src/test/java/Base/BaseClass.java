package Base;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	public static WebDriver driver;
	@BeforeSuite
	public void timeStamp() {
		Date d=new Date();
		Timestamp ts=new Timestamp(d.getTime());
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(ts));
	}
	@AfterSuite
	public void timeStamp01() {
		Date d=new Date();
		Timestamp ts=new Timestamp(d.getTime());
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(ts));
	}
	@BeforeTest
	public void driverIni() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void driverClose() {
		driver.close();
	}
	@BeforeClass
	public void login() {
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("tejugaddam123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("tejuteju");
		driver.findElement(By.id("login")).click();
	}
}
	
	
	
	
	
	
