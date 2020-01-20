package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
		driver.manage().window().maximize();
		driver.findElement(By.id("src")).sendKeys("chennai");
		driver.findElement(By.id("dest")).sendKeys("bhopal");
driver.findElement(By.id("search_btn")).click();
Thread.sleep(2000);
	driver.close();
	driver.quit();
	
	}

}
