package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yatra {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		driver.manage().window().maximize();
		/*Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//ul[@class='be-tabs-snipe clearfix']/li[7]"));
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[@id='booking_engine_luxury_trains']//span")).click();*/
		
		driver.findElement(By.xpath("//a[@id='https://in.bookmyshow.com/bengaluru/movies/martin/ET00328827-0']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//div[@class='cta-button__CtaText-sc-1vmod7e-2 bGbeea']/../..//span")).click();
		
		Thread.sleep(2000);
		
		

		
		
		
	}

}
