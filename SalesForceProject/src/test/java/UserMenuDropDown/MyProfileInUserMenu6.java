package UserMenuDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class MyProfileInUserMenu6 {

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
		WebElement myprofile=driver.findElement(By.linkText("My Profile"));
		myprofile.click();
		Thread.sleep(4000);
		WebElement edit=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]"));
		edit.click();
		//switchframe
		driver.switchTo().frame("contactInfoContentId");
		driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("veg");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")).click();
		driver.switchTo().frame(0);
		WebElement post=driver.findElement(By.xpath("//*[@style='height: auto; min-height: auto;']"));
		post.click();
		post.sendKeys("hello world");
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("#publishersharebutton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='File']")).click();
		driver.findElement(By.id("chatterUploadFileAction")).click();
		//upload file
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
		choosefile.sendKeys("C:\\Users\\mpveg\\Documents\\java part 1.txt");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		//upload photo
		WebElement ele=driver.findElement(By.id("displayBadge"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
		driver.switchTo().frame("uploadPhotoContentId");
		Thread.sleep(4000);
		
		driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile")).sendKeys("C:\\Users\\mpveg\\Desktop\\java\\image.jpeg");
		Thread.sleep(5000);
		driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();

		
		
		
		
		
	
	}

}
