package SeliniumProject.SeliniumProject;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\farhan\\Desktop\\java full course\\chrome driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
	/*	driver.get("https://www.facebook.com/");
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        driver.findElement(By.id("lastname")).sendKeys("Shadab");
		driver.close();*/
		
		driver.get("https:\\www.amazon.in");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	    Actions act=new  Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"))).build().perform();
	    
	    driver.findElement(By.linkText("Start here.")).click();
	    
		Thread.sleep(3000);
		WebElement C=driver.findElement(By.xpath("//select[@id='auth-country-picker']"));
		
		Thread.sleep(2000);
		
		Select sel=new Select(C);
		
	//	sel.selectByIndex(5);
	//	sel.selectByValue("AF");
	//	sel.selectByVisibleText("AF +93");
	//	System.out.print(Contr.getAttribute("Value"));
		
		List<WebElement> co = sel.getOptions();
		System.out.println(co.size());
		
		for (int i=0 ; i<co.size(); i++) {
			
			String str=co.get(i).getText();
			System.out.println(str);
			co.get(i).click();
			
		}
		
		driver.close();
		
		
		
		

		/*	Set<String> handler=driver.getWindowHandles();
			Iterator<String> it=handler.iterator();
			System.out.print("Parent="+it.next());
			String child=  it.next();
			System.out.print("Child="+child);
			
			driver.switchTo().window(child);*/
		
	
		
	}

}
