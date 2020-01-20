package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/ ");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("khushboopatelgurjar@gmail.com");
driver.findElement(By.id("pass")).sendKeys("9826041630");
driver.findElement(By.id("u_0_b")).click();
	Thread.sleep(1000);
	driver.close();
	driver.quit();

















}
}
