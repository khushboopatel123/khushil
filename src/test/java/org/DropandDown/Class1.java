package org.DropandDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html\r\n");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("khushboo");
	
	
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("patel");
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("adress");
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("khushboo@gmail.com");
	
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7894561230");
	
	
	driver.findElement(By.xpath("//label[text()=' FeMale']")).click();

	//WebElement w=driver.findElement(By.id("Skills"));
	
	
	//Select hindi= new Select(w);
	
	//hindi.selectByIndex(3);
	
	
	WebElement p=driver.findElement(By.id("countries"));
	
	Select  K=	new Select(p);
	
	
	K.selectByIndex(2);
	
	}


}
