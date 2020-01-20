package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp\r\n");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("khushboo");
	driver.findElement(By.id("pass")).sendKeys("patel");
	driver.findElement(By.id("login")).click();
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	
	
	
	}

}
