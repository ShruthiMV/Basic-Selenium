package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(3000);
		driver.close();

	}

}
