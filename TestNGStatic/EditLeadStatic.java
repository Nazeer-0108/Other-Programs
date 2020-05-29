package TestNGStatic;
import org.testng.annotations.Test;

import TestNG.LoginFuncStatic;
import TestNG.LoginFuncTest;
public class EditLeadStatic extends LoginFuncStatic
{
	@Test
	public void runEditLeadStatic() throws InterruptedException
	{
		/*driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("95");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Google");
		driver.findElementByName("submitButton").click();
		*/
		driver.findElementByXPath("//a[contains(@href, 'findLeads')]").click();
		Thread.sleep(1500);
		driver.findElementByXPath("(//input[@name = 'firstName'])[3]").sendKeys("Gopi");
		driver.findElementByXPath("(//tbody/tr//em[@unselectable='on']/button[@class='x-btn-text'])[7]").click();
		driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[1]").click();
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(1500);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Java-Selenium");
		driver.findElementByXPath("//input[contains(@name, 'submitButton')][1]").click();
		System.out.println("Edit Lead is done");
	}
}