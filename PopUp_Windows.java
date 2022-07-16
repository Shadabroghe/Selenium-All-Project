package SeliniumProject.SeliniumProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Alert Window POP up.
		
	/*	driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("proceed")).click();

		
		Alert sde =driver.switchTo().alert();
		System.out.println(sde.getText());
		
		if(sde.equals(sde)) {
			sde.accept();
			System.out.print("correct");
		}
	
		
		else
		{
			System.out.print("incorrect");
		}

		driver.close();*/
		
		
		//File Handling Window.
	/*	
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500,TimeUnit.SECONDS);
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\farhan\\Desktop\\My photos\\20201114_210218.jpg");

		*/
		
		//I Frame handling.
		
	/*	driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500,TimeUnit.SECONDS);
		
		driver.switchTo().frame("main frame"); */
		
		
	//Browser Window POP up	
		
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500,TimeUnit.SECONDS);
		
		driver.findElement(By.id("fileupload")).click();
		
		Set<String> handler =driver.getWindowHandles();
		
		Iterator<String> it= handler.iterator();
		
		String perr =it.next();
		
		System.out.print("Parent ID="+perr);
		
		String child=it.next();
		
		System.out.print("Child ID="+child);

		driver.switchTo().window(child);
		
		
		
		
	}

}
