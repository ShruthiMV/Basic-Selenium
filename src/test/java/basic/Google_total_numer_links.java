package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_total_numer_links {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> elements =driver.findElements(By.tagName("a"));
		int size=elements.size();
		System.out.println(size);
		int enabled=0,disabled=0;
		
		for(int i=0;i<size;i++) 
		
		{
		
		WebElement ele=elements.get(i);
		boolean b=ele.isEnabled();
		if(b) 
		{
		
	    enabled++;
			
		}
		
		else
			
		{
			
			disabled++;
			
		} 
		
		}
    System.out.println("Total number of enabled links " +enabled);
    System.out.println("Total number of diabled links " +disabled);
		
}
	
}
