package XapathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/contact.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("InputName")).sendKeys("khuahboo");
	driver.findElement(By.id("InputEmail1")).sendKeys("khushboo@gmail.com");
	driver.findElement(By.id("InputSubject")).sendKeys("7723967755");
	
	WebElement w=driver.findElement(By.name("courses"));
	Select s= new Select(w);
	s.selectByIndex(3);
	
	WebElement k=driver.findElement(By.name("branch"));
	Select l=new Select(k) ;
	l.selectByIndex(2);
	
	WebElement p=driver.findElement(By.name("time"));
	Select h=new Select(p);
	h.selectByIndex(1);
	driver.findElement(By.name("comments")).sendKeys("hello how are you");
	driver.findElement(By.id("submit")).click();
	
	}

}
