package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html ");
		//WebElement ele=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		Thread.sleep(3000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(ele);
		driver.switchTo().frame("singleframe");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='container']//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Shruthi");
		
		
		
	}

}
