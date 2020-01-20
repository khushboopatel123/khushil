package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class1 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

WebElement email = driver.findElement(By.id("email"));
email.sendKeys("khushboopatel");
Actions a=new Actions(driver);
a.doubleClick(email).perform();
//Thread.sleep(3000);
a.contextClick(email).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);



r.keyPress(KeyEvent.VK_ENTER);

r.keyRelease(KeyEvent.VK_ENTER);

 driver.findElement(By.id("pass")).click();

r.keyPress(KeyEvent.VK_CONTROL);

r.keyPress(KeyEvent.VK_V);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);





}
}
