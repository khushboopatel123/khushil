package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html\r\n");
	
	driver.manage().window().maximize();
	driver.close();
	driver.quit();
}
}
