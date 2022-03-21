package SFDClogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassWord4B {
    @Test
	public void forgotpassWord1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("123");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("22131");
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
		String actualText=driver.findElement(By.id("error")).getText();
		String expectedText="please check your usename ans password.can't log in,contact the administrator at your company";
		if(actualText.equalsIgnoreCase(expectedText))
				System.out.println("error message displayed please check the application");
		else
			System.out.println("error mes not displayed");
		   System.out.println("forgot password is completed");
			

	}

}
