package SeliniumProject.SeliniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Actions act= new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"))).build().perform();
		
		driver.findElement(By.linkText("Your Account")).click();
		driver.navigate().back();
		List<WebElement> str = driver.findElements(By.tagName("a"));
		
		System.out.println(str.size());
		Thread.sleep(5000);
		
		for(int i=0;i<str.size();i++) {
			
			String rt=str.get(i).getText();
			System.out.println(rt);
		}
		driver.close();
	}

}
