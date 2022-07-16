package SeliniumProject.SeliniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_keyboard_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Thread.sleep(5000);
		//driver.findElement(By.id("target")).sendKeys(Keys.SPACE);
		
	
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.NUMPAD3).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
