package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_href_links {

	public static void main(String[] args) 
	
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.titleContains("Googl")); 
		System.out.println("Login page displayed"); 
		List<WebElement> elements =driver.findElements(By.tagName("a"));
		int size=elements.size();
		System.out.println(size);
		
		
		
		for(int i=0;i<size;i++) 
		
		{
		
		WebElement ele=elements.get(i);
		System.out.println(ele.getAttribute("href"));

	    }

    }

}