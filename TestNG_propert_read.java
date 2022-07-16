package SeliniumProject.SeliniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_propert_read {

	
	WebDriver driver;
	
	
	@BeforeMethod
	public void Facebooke_login() {
		System.setProperty("WebDriver.chrome.Driver","C:\\Users\\farhan\\Desktop\\java full course\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
		
		
		@Test
		public void username() {
		driver.findElement(By.xpath("")).sendKeys("shadab_55@ymail.com");
			
	}
		@Test
		public void Password_test() {
		driver.findElement(By.xpath("")).sendKeys("Shadab@1234");
		
		}
		@Test
		public void LoginBtton_test() {
		driver.findElement(By.xpath("")).click();
		}
		
		@AfterMethod
		public void TearDown() {
			driver.close();
			driver.quit();
			
			}
		
		
		
		
		
		
		
}
