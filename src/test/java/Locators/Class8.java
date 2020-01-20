package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("text")).sendKeys("khushboopatelgurjar@gmail.com");
	driver.findElement(By.xpath("password")).sendKeys("72396775");
	driver.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	
	
	
	
	
	
	
	
	}

}
