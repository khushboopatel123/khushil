package XapathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	String s=driver.getCurrentUrl();
	System.out.println(s);
	
	String p=driver.getTitle();
	System.out.println(p);
	
WebElement w=driver.findElement(By.xpath("//span[text()='Create an account']"));
String l=w.getText();
System.out.println(l);

	WebElement h=driver.findElement(By.xpath("//input[@id='email']"));
	h.sendKeys("khushboo");
	String g=h.getAttribute("value");
	System.out.println(g);
	String n=h.getAttribute("id");
	System.out.println(n);
	
	
	
	}

}
