package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_text_display {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.titleContains("Facebook")); 
		System.out.println("Login page displayed"); 
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//input[@name='firstname']"));
		ele.sendKeys("Shruthi");
		Thread.sleep(3000);

		boolean status=ele.isDisplayed();
		if(status)
		{
		
             System.out.println("Firstname field is not empty");
	    }
		else
		{
			
			    System.out.println("Firstname field is empty");

			
		}

}
}