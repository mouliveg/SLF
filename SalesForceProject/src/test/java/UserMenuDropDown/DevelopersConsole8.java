package UserMenuDropDown;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevelopersConsole8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
		WebElement usermenu=driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		WebElement closewindow=driver.findElement(By.xpath("//*[contains(text(),'Developer Console')]"));
		closewindow.click();
		Set<String> window=driver.getWindowHandles();
		int size=window.size();
	      String ids[]=new String[size];
	      Iterator<String> itr=window.iterator();
	      for(int i=0;i<size;i++)
	      {
	    	  ids[i]=itr.next();
	      }
      driver.switchTo().window(ids[1]);
       
       driver.close();
       
	

	}

}
