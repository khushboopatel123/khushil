package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.swiggy.com/\r\n");
	driver.manage().window().maximize();
	driver.findElement(By.id("location")).sendKeys("chennai");
	driver.findElement(By.id("FIND FOOD")).click();
		Thread.sleep(300);
		driver.close();
		driver.quit();
		
	
	
	
	
	
	
	
	
	}

}
