package SeliniumProject.SeliniumProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits_in_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		System.setProperty("Chromedriver", "C:\\Users\\farhan\\Desktop\\java full course\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement element=  driver.findElement(By.id("email"));
		
	
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys("Shadab_55@mail.com");
		
		
		
		
		
		
	}


}
