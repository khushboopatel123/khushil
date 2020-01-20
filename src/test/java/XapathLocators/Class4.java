package XapathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class4 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("khushboo");
	driver.findElement(By.id("lastname")).sendKeys("patel");
	//driver.findElement(By.id("buttonwithclass")).click();
	//Thread.sleep(2000);
	
	
	driver.findElement(By.id("sex-1")).click();
	driver.findElement(By.xpath("//input[@id='exp-2']")).click();
	
	

	
	
	
	
	//driver.close();
	//driver.quit();
	
	}

}
