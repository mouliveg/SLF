package UserMenuDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserMenuDropDown5 {

	public static void main(String[] args) {
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
		WebElement usermenu=driver.findElement(By.id("userNav-arrow"));
		usermenu.click();
		String actualmenu=usermenu.getText();
		System.out.println(usermenu.getText());
		String expectedmenu="my profile,my settings,developer console,switching to lightning experiance,log out";
		System.out.println(expectedmenu);
		if(actualmenu.equalsIgnoreCase(expectedmenu))
			System.out.println("usermenu dropdown is passed ");
		else
			System.out.println("usemenu dropdown is not passed");
		

	}

}
