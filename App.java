package SeliniumProject.SeliniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        
        
        

	/*	//System.setProperty("webdriver.chrome.driver","C:\\Users\\farhan\\Desktop\\java full course\\chrome driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Facebook");
		
		
		
		//driver.close();*/
        
        
        
        

		System.setProperty("webdriver.gecko.driver","C:\\Users\\farhan\\Desktop\\java full course\\fi\\geckodriver.exe");
	//	WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Facebook");
		
    }
    
    
}
