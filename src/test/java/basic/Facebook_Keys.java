package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Keys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*WebElement ele =driver.findElement(By.xpath("//input[@id='email']"));
		ele.sendKeys("shruthimvgowrang");
		String text=ele.getAttribute("value");
		System.out.println(text);

		
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		ele.sendKeys(Keys.TAB+(Keys.CONTROL+"v"));
		System.out.println("executed");
		//driver.close();
		
		Dimension d=ele.getSize();
		int h1=d.getHeight();
		System.out.println(h1);
		int w1=d.getWidth();
		System.out.println(w1);*/
	
		
		Actions a =new Actions(driver);
		WebElement email = driver.findElement(By.id("email"));
		a.keyDown(Keys.SHIFT).perform();
		a.sendKeys(email,"admin").perform();
		a.keyUp(Keys.SHIFT).perform();
		a.sendKeys(email, "manager").perform();
		
		
		
		
		
		
	}

}
