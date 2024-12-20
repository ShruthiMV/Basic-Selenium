package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.facebook.com/reg/?next=%2Fphoto%3Ffbid%3D2526068750908186%26set%3Da.122608374587581");
		
		WebElement ele1 =driver.findElement(By.id("day"));
		Select s = new Select(ele1); 
		List<WebElement> list = s.getOptions(); 
		for(int i=0;i<list.size();i=i+2) 
		{ 
		s.selectByIndex(i); 
		} 
		
		
		List<WebElement> list1 = s.getAllSelectedOptions(); 
		for(int i=0;i<list1.size();i=i+1) 
		{ 
		WebElement ele = list1.get(i); 
		String str = ele.getText(); 
		System.out.println(str); 
		} 

    }
}
