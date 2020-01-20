package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/ \r\n");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("fldLoginUserId")).sendKeys("1234");
	driver.findElement(By.xpath("continue")).click();
	Thread.sleep(3000);
	driver.close();
	driver.quit();
	
	
	
	
	
	
	
	
	}

}
