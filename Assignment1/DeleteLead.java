package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/");
		WebElement txtUsername = driver.findElementById("username");
		txtUsername.sendKeys("DemoSalesManager");
		WebElement txtPassword = driver.findElementById("password");
		txtPassword.sendKeys("crmsfa");
		WebElement btnLogin = driver.findElementByClassName("decorativeSubmit");
		btnLogin.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(2000);
		//Create Lead
		driver.findElementByLinkText("Create Lead").click();
		WebElement txtCompanyname = driver.findElementById("createLeadForm_companyName");
		txtCompanyname.sendKeys("TestLeaf Ltd");
		WebElement txtFirstname = driver.findElementById("createLeadForm_firstName");
		txtFirstname.sendKeys("ABCD");
		WebElement txtLastname = driver.findElementById("createLeadForm_lastName");
		txtLastname.sendKeys("XYZ");
		driver.findElementByXPath("(//input[@name = 'primaryPhoneCountryCode'])[4]").clear();
		driver.findElementByXPath("(//input[@name = 'primaryPhoneCountryCode'])[4]").sendKeys("91");
		driver.findElementByXPath("(//input[@name = 'primaryPhoneAreaCode'])[4]").sendKeys("44");
		driver.findElementByXPath("(//input[@name = 'primaryPhoneNumber'])[4]").sendKeys("1234567");
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		
		String completePhoneNo = driver.findElementByXPath("//b[text()='Phone Number']/following::div[1]").getText();
		//  driver.findElementByClassName("tabletext").getText();
		String[] firstSplit = completePhoneNo.split(" ");
		for (int i = 0; i < firstSplit.length; i++) 
		{
			System.out.println("After 1st split " + firstSplit[i]);
		}
		String ccode = firstSplit[0];
	//	System.out.println("Country Code: " + ccode);
		String remPhoneNo = firstSplit[1];
		String[] secondSplit = remPhoneNo.split("-");
		for (int j = 0; j < secondSplit.length; j++) 
		{
			System.out.println("After 2nd split " + secondSplit[j]);
		}
		String acode = secondSplit[0];
		String pNumber = secondSplit[1];
	//	System.out.println("Area Code: " + acode);
	//	System.out.println("Phone Number: " + pNumber);
		
		//Find Leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[contains(text(), 'Phone')]").click();
		Thread.sleep(2000);
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByName("phoneCountryCode").sendKeys(ccode);
		driver.findElementByName("phoneAreaCode").sendKeys(acode);
		driver.findElementByName("phoneNumber").sendKeys(pNumber);
		driver.findElementByXPath("(//tbody/tr//em[@unselectable='on']/button[@type='button'])[7]").click();
		Thread.sleep(2000);
		String leadID = driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[1]").getText();
		System.out.println("Lead ID is: " + leadID);
		driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[1]").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Delete").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByName("id").sendKeys(leadID);
		driver.findElementByXPath("(//tbody/tr//em[@unselectable='on']/button[@type='button'])[7]").click();
		Thread.sleep(1000);
		String searchResult = driver.findElementByClassName("x-paging-info").getText();
		System.out.println("Search Result is: " + searchResult);
		Thread.sleep(1000);  
		driver.close();
	}
}