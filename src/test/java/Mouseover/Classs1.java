package Mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Classs1 {
	public static void main(String[] args) {
		System.setProperty("weddriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");   
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/careers.html");

	
	//String a=driver.getCurrentUrl();
	//System.out.println(a);
	
	//String b=driver.getTitle();
	///System.out.println(b);
	
	//WebElement c=driver.findElement(By.xpath(""));
	//String d=c.getText();
	//System.out.println(d);
	
	WebElement Careers=driver.findElement(By.xpath("//a[text()='CAREERS']"));
	Actions e=new Actions(driver);
	e.moveToElement(Careers).perform();
	
	//WebElement computer=driver.findElement(By.xpath(""));
	//computer.click();
	
	//WebElement sre=driver.findElement(By.id(""));
	//WebElement des=driver.findElement(By.id(""));
	//Actions f=new Actions(driver);
	//f.dragAndDrop(sre, des);
	
	//WebElement w=driver.findElement(By.id(""));
	//Select g=new Select(w);
	//g.selectByIndex(2);
	
	//WebElement y=driver.findElement(By.id(""));
	//Select i=new Select(y);
	//boolean z=i.isMultiple();
	//System.out.println(z);
	
	}
	
	

}
