package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		
		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html"); 
		 
		WebElement drag_ele = driver.findElement(By.id("draggable")); 
		WebElement drop_ele = driver.findElement(By.id("droppable")); 
		int drag_xloc = drag_ele.getLocation().getX(); 
		int drag_yloc = drag_ele.getLocation().getY(); 
		
		a.moveToElement(drag_ele).perform(); 
		a.clickAndHold().perform(); 
	    a.moveByOffset(drag_xloc, drag_yloc).release().build().perform();*/
		
		
		driver.get("https://www.actitime.com/"); 
		
		
		Actions a =new Actions(driver); 
		/*WebElement email = driver.findElement(By.id("email")); 
		a.keyDown(Keys.SHIFT).perform(); 
		a.sendKeys(email,"admin").perform(); 
		a.keyUp(Keys.SHIFT).perform(); 
		a.sendKeys(email, "manager").perform(); 
		Thread.sleep(3000);
		email.sendKeys(Keys.TAB);
		Thread.sleep(3000);

		a.keyDown(Keys.SHIFT).perform();
		Thread.sleep(3000);

		a.sendKeys("shruthi").perform();*/
		
		
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(3000);

		WebElement email=driver.findElement(By.id("Enteryouremail"));

		a.keyDown(Keys.SHIFT).perform();
		a.sendKeys(email, "mvshruthi").perform();
		Thread.sleep(3000);

		a.keyUp(Keys.SHIFT).perform();
		a.sendKeys(email, "mvshruthi").perform();
		Thread.sleep(3000);

		//email.sendKeys(Keys.CLEAR);
		int size=email.getSize().getHeight();
       System.out.println(size);
		
//Branch 1 created
       

	}

}
