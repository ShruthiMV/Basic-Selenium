package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		Thread.sleep(3000);
		

		String str=ele.getAttribute("title");
		System.out.println(str);
		
		ele.sendKeys("phone");
		Thread.sleep(3000);
		
		
		if(ele.isDisplayed())
		{
		     System.out.println("Search field is not empty");
		     
		}
		
		else
		{
 
			System.out.println("Search field is empty");
		}
	}
}