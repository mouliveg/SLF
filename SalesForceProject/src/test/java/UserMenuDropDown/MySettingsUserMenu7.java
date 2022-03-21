package UserMenuDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MySettingsUserMenu7 {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement mysettings=driver.findElement(By.cssSelector("a[title='My Settings']"));
		mysettings.click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('PersonalInfo');\"]")).click();
	driver.findElement(By.xpath("//a[@id='LoginHistory_font']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
	driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[4]/div[3]/a[1]")).click();
	driver.findElement(By.xpath("//a[@id='CustomizeDisplay_font']")).click();
	driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[4]/div[4]/a[1]")).click();
	driver.findElement(By.xpath("//a[@id='EmailSettings_font']")).click();
	driver.findElement(By.xpath("//input[@id='sender_name']")).clear();
	driver.findElement(By.xpath("//input[@id='sender_name']")).sendKeys("mouli");
	driver.findElement(By.xpath("//input[@id='sender_email']")).clear();
	driver.findElement(By.xpath("//input[@id='sender_email']")).sendKeys("mouli.vegesna@gmail.com");
	driver.findElement(By.xpath("//input[@id='auto_bcc1']")).click();
	driver.findElement(By.xpath("//*[@name='save']")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('CalendarAndReminders');\"]")).click();
	driver.findElement(By.id("Reminders_font")).click();
	driver.findElement(By.cssSelector("#testbtn")).click();
	
	}
	
	

}
