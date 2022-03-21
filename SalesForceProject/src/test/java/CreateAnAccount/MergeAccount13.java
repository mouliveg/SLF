package CreateAnAccount;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeAccount13 {

	//private static final String VK_ESCAP = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
		driver.findElement(By.cssSelector("a[title='Accounts Tab']")).click();
		Thread.sleep(4000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		
		
		driver.findElement(By.xpath("//*[text()='Merge Accounts']")).click();
		driver.findElement(By.cssSelector("#srch")).sendKeys("mogli");
		driver.findElement(By.xpath("//input[@name='srchbutton']")).click();
	}

}
