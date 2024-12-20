package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cric_buzz {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.cricbuzz.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='cb-col cb-col-100']//ul/li[4]//a[@title='Trinbago Knight Riders v Antigua and Barbuda Falcons - 20th Match']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
Thread.sleep(3000);
List<WebElement> list=driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]//div[1]"));
System.out.println("Total no of players " +list.size()); 
for(int i=0;i<list.size();i++) 
{ 
WebElement ele = list.get(i); 
System.out.println(ele.getText()); 
} 





 }

}
