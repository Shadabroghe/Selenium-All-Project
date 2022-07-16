package SeliniumProject.SeliniumProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigaionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\farhan\\Desktop\\java full course\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:\\www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.name("q"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("q")))).sendKeys("gmail login");
		
		WebElement search=driver.findElement(By.name("btnK"));
		wait.until(ExpectedConditions.elementToBeClickable(search)).click();
				
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.close();
		
		
		
		
		
	}

}
