package CreateOPTY;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOpportunities15TO19 {

	 static WebDriver driver;
	 
	static Actions action;

	public static void opportunities15() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement loginpage=driver.findElement(By.name("Login"));
		loginpage.click();
         driver.findElement(By.cssSelector("#Opportunity_Tab")).click();
	     Thread.sleep(4000);
	
	    Actions action = new Actions(driver);

	   action.sendKeys(Keys.ESCAPE).build().perform();
       
		WebElement dropdown=driver.findElement(By.cssSelector("#fcf"));
		dropdown.click();
		String dropdownread=dropdown.getText();
		System.out.println(dropdownread);
		
	}
	public static void createnewopty16() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement loginpage=driver.findElement(By.name("Login"));
		loginpage.click();
         driver.findElement(By.cssSelector("#Opportunity_Tab")).click();
	     Thread.sleep(4000);
	
	 Actions action = new Actions(driver);

	action.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//*[@name='new']")).click();
		driver.findElement(By.id("opp3")).sendKeys("sales");
		driver.findElement(By.id("opp4")).sendKeys("finance");
		driver.findElement(By.id("opp9")).click();
		Select month=new Select(driver.findElement(By.id("calMonthPicker")));
		 month.selectByVisibleText("March");
		 String date="16";
		 List<WebElement> alldates=driver.findElements(By.xpath("//*[@id='datePicker']//td"));
		 
		 for(WebElement ele:alldates)
		 {
			 String dt=ele.getText();
			 if(dt.equals(date)) {
				 ele.click();
				 break;
			 }
		 }
		 Select state=new Select(driver.findElement(By.cssSelector("#opp11")));
		 state.selectByValue("Qualification");
		 driver.findElement(By.cssSelector("#opp12")).clear();
		 driver.findElement(By.cssSelector("#opp12")).sendKeys("80");
		Select leadsource=new Select(driver.findElement(By.id("opp6")));
		leadsource.selectByVisibleText("Web");
		driver.findElement(By.cssSelector("#opp17")).sendKeys("Tekark");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		}
	
	public static void opportunitypipeline17() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement loginpage=driver.findElement(By.name("Login"));
		loginpage.click();
         driver.findElement(By.cssSelector("#Opportunity_Tab")).click();
	     Thread.sleep(4000);
	
	 Actions action = new Actions(driver);

	action.sendKeys(Keys.ESCAPE).build().perform();
		
	driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
	}
	public static void stuckopportunityreport18() throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement loginpage=driver.findElement(By.name("Login"));
		loginpage.click();
         driver.findElement(By.cssSelector("#Opportunity_Tab")).click();
	     Thread.sleep(4000);
	
	 Actions action = new Actions(driver);

	action.sendKeys(Keys.ESCAPE).build().perform();
		
			driver.findElement(By.xpath("//*[text()='Stuck Opportunities']")).click();
	}
	
	public static void quaterlysummaryreport19() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mohini@tek.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("mouli143!");
		WebElement loginpage=driver.findElement(By.name("Login"));
		loginpage.click();
         driver.findElement(By.cssSelector("#Opportunity_Tab")).click();
	     Thread.sleep(4000);
	
	 Actions action = new Actions(driver);

	action.sendKeys(Keys.ESCAPE).build().perform();
		Select interval=new Select(driver.findElement(By.cssSelector("#quarter_q")));
		interval.selectByVisibleText("Next FQ");
		Select include=new Select(driver.findElement(By.cssSelector("#open")));
		include.selectByValue("open");
		
	}
	
	
	

}
