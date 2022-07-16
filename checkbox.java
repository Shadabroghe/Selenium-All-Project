package SeliniumProject.SeliniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[3]/span[1]/a[1]/span[1]")).click();
		driver.close();
		
		
		
				
		
		
	}

}
