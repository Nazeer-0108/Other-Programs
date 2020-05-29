package TestNGStatic;
import org.testng.annotations.Test;
import TestNG.LoginFuncStatic;
public class CreateLeadStatic extends LoginFuncStatic
{
	@Test
	public void runCreateLeadStatic() throws InterruptedException
	{
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopinath");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jayakumar");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9597704568");
		driver.findElementByName("submitButton").click();
		System.out.println("Create Lead is done");
	}
}
