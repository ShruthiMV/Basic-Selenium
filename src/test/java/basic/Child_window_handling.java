package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Child_window_handling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
	WebElement ele=driver.findElement(By.xpath("//a[text()='My Account']"));
	Actions a =new Actions(driver);
	a.moveToElement(ele).perform();
	Thread.sleep(3000);
	driver.findElement(By.id("SignUpBtn")).click();
	Thread.sleep(3000);

	
	driver.findElement(By.xpath("//button[text()='sign in with facebook']")).click();
	Thread.sleep(3000);
	
	

	                   Set<String> wh = driver.getWindowHandles();
	                    Iterator<String> i = wh.iterator();
	                    
	                    
	                    while(i.hasNext()) {
	                    
	                       
	                       String s = i.next();
	                      driver.switchTo().window(s);
	                      String title=driver.getTitle();
	                      System.out.println(title);
	                    }

      }
}