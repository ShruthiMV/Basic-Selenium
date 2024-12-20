package basic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc_ {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions c=new ChromeOptions();
		c.addArguments("disable-notifications");
		
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@role='searchbox' and @class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ng-trigger ng-trigger-overlayAnimation ng-tns-c57-8 ui-autocomplete-panel ui-widget ui-widget-content ui-corner-all ui-shadow ng-star-inserted']//ul//li[4]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c65-12']")).click();
	    
		Thread.sleep(3000);

		WebElement ele=driver.findElement(By.xpath("//span[text()='PERSON WITH DISABILITY']"));
		
		ele.click();
		Thread.sleep(3000);
	
		
		
		WebElement ele3=driver.findElement(By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-helper-clearfix ui-corner-top ng-tns-c56-7']/..//div//span[text()='OK']"));
		ele3.click();
		
		driver.close();
		
			
  
		
	
	}
		
	
		
	
	
}

