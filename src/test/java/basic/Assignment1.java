package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(ele);
		List<WebElement> list = s.getOptions(); 
		Thread.sleep(3000);
		s.selectByVisibleText("Apr");
		Thread.sleep(3000);

		s.selectByVisibleText("Aug");
		Thread.sleep(3000);

		s.selectByVisibleText("Dec");
		Thread.sleep(3000);

		s.selectByVisibleText("Feb");
		Thread.sleep(3000);

		s.selectByVisibleText("Jan");
		Thread.sleep(3000);

		s.selectByVisibleText("Jun");
		Thread.sleep(3000);

		s.selectByVisibleText("Jul");
		Thread.sleep(3000);

		s.selectByVisibleText("Mar");
		Thread.sleep(3000);

		s.selectByVisibleText("May");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Nov");
		Thread.sleep(3000);

		s.selectByVisibleText("Oct");
		Thread.sleep(3000);

		s.selectByVisibleText("Sep");
		
		Thread.sleep(3000);
		System.out.println("done");
		
		List<WebElement> elements = s.getAllSelectedOptions();
		Thread.sleep(3000);

		int size=elements.size();
		
		for(int i=1;i<size;i++) {
			
			           WebElement ele2=elements.get(i);			           
			           String str=ele2.getText();
			           System.out.println(str);
			   	
		}
		
		
		
	}

}
