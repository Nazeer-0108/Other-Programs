package TestNGMethods;
import org.testng.annotations.Test;
import TestNG.LoginFuncTest;
public class EditLead extends LoginFuncTest
{
	@Test
	public void runEditLead() throws InterruptedException
	{
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("95");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Google");
		driver.findElementByName("submitButton").click();
		System.out.println("Edit Lead is done");
	}
}