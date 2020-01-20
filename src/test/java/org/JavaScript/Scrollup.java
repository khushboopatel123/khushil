package org.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup {		
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement down = driver.findElement(By.xpath("//div[text()='Gender']"));
JavascriptExecutor jk= (JavascriptExecutor)driver;
jk.executeScript("arguments[0].scrollIntoView(true)",down);
Thread.sleep(3000);
WebElement up=driver.findElement(By.xpath("//span[text()='Create an account']"));
	//WebElement up=driver.findElement(By.id(""));	
jk.executeScript("arguments[0].scrollIntoView(false)", up);
	
	
	
	}

}
