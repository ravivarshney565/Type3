import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prop2 {

	public static void main(String[] args) throws IOException {
		
		File propfile2 = new File("Config//Browser_Detail.properties");
		
		Properties properties2 = new Properties();
		
		FileInputStream FIS1 = new FileInputStream(propfile2);
		
		properties2.load(FIS1);
		
		String str1 = properties2.getProperty("Browser_Name");
		
		WebDriver driver = null;
		
		if (str1.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		
		else if (str1.equals("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		}
			
		driver.get(properties2.getProperty("Url"));
		
		driver.findElement(By.ByName.name("q")).sendKeys("Seelnium 3-Firefox");
		
		driver.findElement(By.name("q")).sendKeys("Seelnium 3-Firefox");
	}

}
