package SeliniumProject.SeliniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\farhan\\Desktop\\java full course\\chrome driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https:\\www.google.com");
		String rl=driver.getCurrentUrl();    //get Current Url of the web page,
		System.out.println(rl);
		String title=driver.getTitle();      //get title of the web page.
		System.out.println(title);
		String text=driver.findElement(By.name("btnI")).getText();   //get the text of gthe element.
		System.out.println(text);
		String tag=driver.findElement(By.xpath("//a[contains(text(),'हिन्दी')]")).getTagName();   //get tag name of the element.
		System.out.println(tag);
		String bn=driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).getAttribute(text);     //get the vale of the given attribte.
		System.out.println(bn);
		driver.findElement(By.name("q")).sendKeys("corona cases in mmbai");
		driver.findElement(By.xpath("//input[contains(@class,'gNO89b')]")).submit();    //same like click.better than click.
		String page=driver.getPageSource();    //to get the HTML Page sorce
		System.out.println(page);
		driver.quit();   //to closed child window and parrent window both.
		
		
		
		
		
		
		
		
		
		
		
	}

}
