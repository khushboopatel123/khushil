package org.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		
		WebElement text = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement btn=driver.findElement(By.id("u_0_b"));
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].setAttribute('value','khushboopatel@gmail.com')", text);
		jk.executeScript("arguments[0].setAttribute('value','9826041630')", pass);
		jk.executeScript("arguments[0].click('value')", btn);
		Object ex = jk.executeScript("return arguments[0].getAttribute('value')",text);
	String s=(String)ex;
System.out.println(s);
		

	
	}

}
