package basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test()
	public void CreateAccount()
	{
	Reporter.log("Create Account",true);
	}
	@Test()
	public void EditAccount()
	{
	Reporter.log("Edit Account",true);
	}
	@Test()
	public void DeleteAccount()
	{
	Reporter.log("Delete Account",true);

}
	
}
