package SeliniumProject.SeliniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverBasic {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\farhan\\Desktop\\java full course\\chrome driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.close();
		
		
		
		
	}
	
	

}
