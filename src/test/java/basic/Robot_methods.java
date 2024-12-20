package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Robot_methods {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions opt = new ChromeOptions(); 
		opt.addArguments("start-maximized"); 
		opt.addArguments("disable-notifications");
		driver.manage().deleteAllCookies();
		driver.get("https://www.yatra.com/"); 
		driver.manage().window().maximize();
		 
		Actions a = new Actions(driver); 
		Thread.sleep(3000);
		WebElement rv = driver.findElement(By.xpath("//img[contains(@alt,'Flat 15% OFF')]")); 
		Thread.sleep(3000);

		a.moveToElement(rv).perform(); 
		Thread.sleep(3000);

		
		a.contextClick(rv).perform(); 
		Thread.sleep(4000); 
		
	}

}
