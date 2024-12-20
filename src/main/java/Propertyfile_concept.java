import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertyfile_concept {

	public static void main(String[] args) throws IOException {
		//Copy file from ROM to RAM 
	/*   FileInputStream f = new FileInputStream("../Basic_Selenium/file.properties"); 
		//open property file 
		Properties p = new Properties(); 
		p.load(f); 
		//fetch data 
		String str = p.getProperty("email"); 
		String str1 = p.getProperty("password"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.id("email")).sendKeys(str); 
		driver.findElement(By.id("pass")).sendKeys(str1);  */
		
		
		FileInputStream f = new FileInputStream("../Basic_Selenium/file.properties"); 
		//open property file 
		Properties p = new Properties(); 
		p.setProperty("p1", "v1"); 
		FileOutputStream f1 = new FileOutputStream("../Basic_Selenium/file.properties"); 
		p.store(f1,"Selenium"); 
		
		
	}

}
