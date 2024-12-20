package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bluetooth");
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion-container']"));
		int size=elements.size();
		System.out.println(size);
		
		

			
			WebElement ele = elements.get(6); 
			ele.click();
			String s=ele.getText();
			System.out.println(s);
		
		
		
	}

}
