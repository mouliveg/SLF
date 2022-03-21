package CreateAnAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditView12 {

	public static void main(String[] args) throws InterruptedException {
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
		
		Actions action = new Actions(driver);

		action.sendKeys(Keys.ESCAPE).build().perform();
		WebElement dropdown=driver.findElement(By.id("fcf"));
		Select selectdropdown=new Select(dropdown);
		selectdropdown.selectByVisibleText("mouli");
		driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("mogli");
		WebElement field=driver.findElement(By.xpath("//select[@id='fcol1']"));
		field.click();
		Select selectfield=new Select(field);
		selectfield.selectByVisibleText("Account Name");
		WebElement operator=driver.findElement(By.xpath("//select[@id='fop1']"));
		operator.click();
        Select selectoperator=new Select(operator);
		selectoperator.selectByValue("c");
		driver.findElement(By.id("fval1")).sendKeys("a");
		driver.findElement(By.xpath("(//input[@title='Save'])[2]")).click();
		
		
		

	}

}
