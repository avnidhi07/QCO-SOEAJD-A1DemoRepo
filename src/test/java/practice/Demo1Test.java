package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1Test {

	WebDriver driver;
	@Test
	public void demoTest() {
		System.out.println("hello");
		String Browser = System.getProperty("browser");
		String Url = System.getProperty("url");
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
		}
		driver.get(Url);
	}
}
