package TestNGDyn;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import TestNG.LoginFuncDyn;
public class CreateLeadDyn  extends LoginFuncDyn
{
	@BeforeTest
	public void setData()
	{
		excelFile = "TC001_CreateLead";
		//excelFile = "InputSheet";
	}

	@Test(dataProvider = "getData") 
	public void runCreateLeadDyn(String cname, String fname, String lname, String phone) throws InterruptedException
	{
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(phone);
		driver.findElementByName("submitButton").click();
		System.out.println("Create Lead is done for " + fname + " "+lname);
	}
}
