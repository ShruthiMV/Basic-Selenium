package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shruthi_links {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); 
		
		WebElement ele1=driver.findElement(By.name("q"));
		
		ele1.sendKeys("Shruthi MV");
		ele1.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);

		List<WebElement> ele2 =driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		
		int size=ele2.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			
			WebElement ele3=ele2.get(i);
			String s=ele3.getText();
			System.out.println(s);
			
			
		}
		
		
		
		
	}

}
