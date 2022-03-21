package CreateAnAccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountReport14 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		String year="2022";
		String month="february";
		String date="20";
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
		driver.findElement(By.cssSelector("a[title='Accounts Tab']")).click();
		Thread.sleep(4000);
		
		Actions action = new Actions(driver);

		action.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//*[text()='Accounts with last activity > 30 days']")).click();
		WebElement d=driver.findElement(By.xpath("//*[@id='ext-gen20' and @name='dateColumn']"));
		d.click();
		driver.findElement(By.xpath("//*[text()='Created Date' and @class='x-combo-list-item']")).click();
		
		driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
		while(true)
		{
			String monthyear=driver.findElement(By.cssSelector("#ext-gen285")).getText();
			String a[]=year.split(" ");
			String mon=a[0];
			String yr=a[1];
			if(mon.equalsIgnoreCase(month)&&yr.equals(year));
			break;
			
	}
	     List<WebElement> allelements =driver.findElements(By.xpath("//ul[@id='ext-gen276']//td"));
	     Thread.sleep(5000);
	     for(WebElement ele:allelements)
	     {
	    	 String dt=ele.getText();
	    	 if(dt.equals(date))
	    	 {
	    		 ele.click();
	    		 break;
	    		 
	    	 }
	     }
		
	

	}

}
