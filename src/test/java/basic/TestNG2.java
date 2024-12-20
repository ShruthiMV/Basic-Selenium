package basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {

	@Test(priority=0)
	public void CreateAccount2()
	{
	Reporter.log("Create Account2",true);
	}
	@Test(priority=2)
	public void EditAccount2()
	{
	Reporter.log("Edit Account2",true);
	}
	@Test(priority=1)
	public void DeleteAccount3() {
	Reporter.log("Delete Account2",true);

}
	
}
