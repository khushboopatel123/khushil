package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	TakesScreenshot t=(TakesScreenshot)driver;
	Object outputType;
	File f=t.getScreenshotAs(OutputType.FILE);
	System.out.println(f);
	File d=new File("C:\\Users\\USER\\eclipse-workspaceSELENIUM\\Selenium\\Screenshot");
	
	FileUtils.copyFileToDirectory(f, d);
	driver.quit();

	}
	
	
	

}
