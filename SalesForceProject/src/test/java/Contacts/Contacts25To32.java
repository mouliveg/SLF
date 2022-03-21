package Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contacts25To32 {
	  static WebDriver driver;
	 static Actions action;
	@BeforeMethod
public void lunchandlogin() throws Exception
{
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
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(4000);
		Actions action =new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
	
   }
	

 @Test
 public void createnewcontact25() throws Exception 
 {
	 
	 
	 WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Create New View']"))).click();
	 
	// WebElement viewname=driver.findElement(By.id("fname"));
	// viewname.sendKeys("XYZ");
	// String actualviewname=viewname.getText();
	 //Assert.assertEquals(actualviewname, viewname);
	 
 }
 
	

}
