package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Username_length_height {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://localhost:8080/login.do"); 
		//username 
		WebElement ele = driver.findElement(By.id("username")); 
		int d = ele.getSize().getHeight();
		int w=ele.getSize().getWidth();
		
		
		System.out.println("Username width= "+d); 
		System.out.println("Username height= "+w); 
		//password 
		
		WebElement ele1 = driver.findElement(By.name("pwd")); 
		Dimension d1 = ele.getSize(); 
		int h2 = d1.getHeight(); 
		int w2 = d1.getWidth(); 
		
		System.out.println("Passowrd width= "+w2); 
		System.out.println("Password height= "+h2); 
		if(d==w2 & w==h2) 
		{ 
		System.out.println("Username & password length is same"); 
		} 
		else 
		{ 
		System.out.println("Username & password length is different"); 
		}
		
		
		
		/*   Dimension d =new Dimension(300,500);
             c.manage().window().setSize(d);
             
             Point p=new Point(180,300);
             c.manage().window().setPosition(p);
            
             Thread.sleep(3000);
             c.manage().window().maximize(); */

	}

}
