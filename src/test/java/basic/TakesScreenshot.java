package basic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakesScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//a[text()='About']"));
		Thread.sleep(3000);

		File src = ele.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);

		File dest= new File("../Basic_Selenium/screenshot/abc.png");
		Thread.sleep(3000);

		FileUtils.copyFile(src,dest);*/
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']"));
		int size=elements.size();
		System.out.println(size);
		Thread.sleep(3000);

		
		for(int i=0;i<size;i++) {
			WebElement tgt_ele = elements.get(i);
			File src = tgt_ele.getScreenshotAs(OutputType.FILE);
			//int name=i+1;
			File dest = new File("../Basic_Selenium/screenshot/image_01.png");
			FileUtils.copyFile(src, dest);
    			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
