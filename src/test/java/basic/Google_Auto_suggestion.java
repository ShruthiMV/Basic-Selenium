package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Auto_suggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium"); 
		Thread.sleep(4000); 
		List<WebElement> elements =driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		int size=elements.size();
		Thread.sleep(3000);

		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			
			WebElement ele = elements.get(i); 
			ele.click();
		
		}
	}

}
