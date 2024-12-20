package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertiesconcept {

	public static void main(String[] args) throws IOException, InterruptedException {

		String path="../Basic_Selenium/file.properties";
		
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		
		String str1=p.getProperty("email");
		String str2=p.getProperty("pass");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys(str1);
		Thread.sleep(3000);

		driver.findElement(By.id("pass")).sendKeys(str2);
		Thread.sleep(3000);

		driver.findElement(By.name("login"));
		Thread.sleep(3000);
		
		p.setProperty("email2", "mv.shruthi10@gmail.com");
		FileOutputStream f1 = new FileOutputStream("../Basic_Selenium/data.properties");
		p.store(f1, "Concepts");	
	}

}
