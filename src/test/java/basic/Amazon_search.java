package basic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(("aaa@gmail.com"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(("sdsdsdd"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
	//	driver.findElement(By.partialLinkText("Forgotten")).click(); */
		 
		driver.get("https://www.irctc.co.in");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		
		Set<String> allwh =driver.getWindowHandles();
		Iterator<String> it=allwh.iterator();
		String parent =it.next();
		String child =it.next();
		
		
		driver.switchTo().window(child);
		Thread.sleep(3000);
		String s =driver.findElement(By.xpath("//button[@class='btn btn-md yellow-gradient home-btn']/../..//button[contains(text(),'Search')]")).getText();		
		System.out.println(s);
	    driver.close();
	    driver.switchTo().window(parent);
	    Thread.sleep(3000);
	    
	    driver.close();
	}

}
