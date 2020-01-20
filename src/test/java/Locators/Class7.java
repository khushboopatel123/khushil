package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/login\r\n");
	driver.manage().window().maximize();
	

	driver.findElement(By.id("userName")).sendKeys("khushbopatelgurjar@gmal.com");
	
	driver.findElement(By.id("checkUser")).click();
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	
	
	
	
	
	
	
	
	}

}
