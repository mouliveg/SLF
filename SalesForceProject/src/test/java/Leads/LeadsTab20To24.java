package Leads;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadsTab20To24 
{
	static WebDriver driver;
	 static Actions action;
	public static void loginandleadstab20() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
	WebElement lead=driver.findElement(By.cssSelector("a[title='Leads Tab']"));
		lead.click();
	Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
	}
	public static void logout()
	{
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.cssSelector("a[title='Logout']")).click();
		
		
		
	}
	public static void leadsselectview21() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
	WebElement lead=driver.findElement(By.cssSelector("a[title='Leads Tab']"));
		lead.click();
	Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		WebElement selectview=driver.findElement(By.xpath("//select[@id='fcf']"));
		selectview.click();
		System.out.println(selectview.getText());
		
	}
	public static void defaultview22() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
	WebElement lead=driver.findElement(By.cssSelector("a[title='Leads Tab']"));
		lead.click();
	Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();

		WebElement selectview=driver.findElement(By.xpath("//select[@id='fcf']"));
		Select view=new Select(selectview);
		view.selectByVisibleText("My Unread Leads");
		
			Thread.sleep(3000);
		WebElement usermenu=driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		WebElement logout=driver.findElement(By.cssSelector("a[title='Logout']"));
		logout.click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("mohini@tek.com");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("mouli143!");
		WebElement log=driver.findElement(By.name("Login"));
		log.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[title='Go!']")).click();
	}
		
		
		public static void todayslead23() throws Exception
		{
			loginandleadstab20();
			Select todayslead=new Select(driver.findElement(By.id("fcf")));
			todayslead.selectByVisibleText("Today's Leads");
			
			
		}
		public static void newbuttononleads24()
		{
			
			driver.findElement(By.cssSelector("input[title='New']")).click();
			driver.findElement(By.id("name_lastlea2")).sendKeys("ABCDE");
			driver.findElement(By.id("lea3")).sendKeys("ABCDEF");
			driver.findElement(By.xpath("(//*[@title='Save'])[1]")).click();
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


