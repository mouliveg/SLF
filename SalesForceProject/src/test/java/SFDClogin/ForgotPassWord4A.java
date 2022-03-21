package SFDClogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassWord4A {

      @Test
      public void forgotoassWord()
      {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement forgotpassword=driver.findElement(By.xpath("//*[contains(text(),'Forgot Your Password?')]"));
		forgotpassword.click();
		WebElement testpassword=driver.findElement(By.xpath(" //input[@id='un']"));
		testpassword.sendKeys("mpvegesna@gmail.com");
		WebElement continuebutton=driver.findElement(By.xpath("//input[@id='continue']"));
		continuebutton.click();
		

	}

}
