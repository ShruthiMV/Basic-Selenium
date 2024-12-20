package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_POM {
	
	@FindBy(id="email")
	private WebElement un;
	
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement login_btn;
	
	
	public Facebook_POM(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	

	public void login(String user,String pass) {
		
		un.sendKeys(user);
		pwd.sendKeys(pass);
		login_btn.click();
		
	}
	

}
