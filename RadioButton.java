package SeliniumProject.SeliniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();*/
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

	/*	driver.get("https://materializecss.com/radio-buttons.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		
		WebElement ase = driver.findElement(By.xpath("//span[contains(text(),'Green')]"));
		ase.click();  */
		

		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		WebElement ase = driver.findElement(By.linkText("Create New Account"));
		ase.click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Shadab");
		
		driver.findElement(By.name("lastname")).sendKeys("Shaikh");
		
		WebElement da=driver.findElement(By.name("birthday_day"));
		
		Select d1= new Select(da);
	//	d1.selectByIndex(5);
	//	d1.selectByValue("31");
		d1.selectByVisibleText("5");
		
		WebElement ade=driver.findElement(By.xpath("//label[text()='Female']"));
		ade.click();
		
		WebElement xde=driver.findElement(By.name("birthday_month"));
		
		Select sel =new Select(xde);
		
		List<WebElement> rad = sel.getOptions();
		System.out.println(rad.size());
		
		for(int i=0; i<rad.size(); i++) {
			
			String qwe=rad.get(i).getText();
			System.out.println(qwe);
			rad.get(i).click();
			
		}
				
				

		 driver.close();

	}

}
