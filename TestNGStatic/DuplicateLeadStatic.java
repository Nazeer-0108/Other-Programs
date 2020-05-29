package TestNGStatic;
import org.testng.annotations.Test;

import TestNG.LoginFuncStatic;
import TestNG.LoginFuncTest;
public class DuplicateLeadStatic extends LoginFuncStatic
{
	@Test
	public void runDuplicateLeadStatic() throws InterruptedException
	{
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
		System.out.println("Duplicate Lead is done");
	}
}