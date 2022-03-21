package SFDClogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckRememberMe3 {

	@Test
	public void checkrememberme()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement rememberme=driver.findElement(By.id("rememberUn"));
		rememberme.click();
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		//Assert.assertTrue(username.isDisplayed());
		//username.sendKeys(args);
		
		
	}
    
	
}
	



