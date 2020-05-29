package TestNGStatic;
import org.testng.annotations.Test;

import TestNG.LoginFuncStatic;
import TestNG.LoginFuncTest;
public class DeleteLeadStatic extends LoginFuncStatic
{
	@Test
	public void runDeleteLeadStatic() throws InterruptedException
	{
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) 
		{
			System.out.println("Text matched");
		} 
		else 
		{
			System.out.println("Text not matched");
		}
		System.out.println("Delete Lead is done");
	}
}