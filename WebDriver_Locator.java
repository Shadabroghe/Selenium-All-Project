package SeliniumProject.SeliniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\farhan\\Desktop\\java full course\\chrome driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Shadab_55@ymail.com");
		driver.findElement(By.name("pass")).sendKeys("Shadab@1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
		
		
	}

}
