package Assignment1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "http://leaftaps.com/opentaps/";
		String txtUsername = "DemoSalesManager";
		String txtPassword = "crmsfa";
		driver.navigate().to(URL);
		driver.findElementById("username").sendKeys(txtUsername);
		driver.findElementById("password").sendKeys(txtPassword);
		WebElement btnLogin = driver.findElementByClassName("decorativeSubmit");
		btnLogin.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(2000);

		//Create Lead
		String txtCompanyname = "TestLeaf org";
		String txtFirstname = "Babuji";
		String txtLastname = "MM";
		String primayEmail = "babu.mm@testleaf.com";
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(txtCompanyname);
		driver.findElementById("createLeadForm_firstName").sendKeys(txtFirstname);
		driver.findElementById("createLeadForm_lastName").sendKeys(txtLastname);
		driver.findElementByXPath("(//input[@id = 'createLeadForm_primaryEmail'])").sendKeys(primayEmail);
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		
		//Find Leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[contains(text(), 'Email')]").click();
		Thread.sleep(2000);
		driver.findElementByName("emailAddress").sendKeys(primayEmail);
		driver.findElementByXPath("(//tbody/tr//em[@unselectable='on']/button[@type='button'])[7]").click();
		Thread.sleep(2000);
		String leadName = driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[3]").getText();
		System.out.println("Lead Name is: " + leadName);
		driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[3]").click();
		Thread.sleep(2000);

		//Duplicate Lead
		driver.findElementByLinkText("Duplicate Lead").click();
		Thread.sleep(2000);
		if (driver.findElementById("sectionHeaderTitle_leads").getText().equals("Duplicate Lead"))
		{
			System.out.println("The expected title " + driver.findElementById("sectionHeaderTitle_leads").getText() + " is displayed");
		}
		else
		{
			System.out.println("The title is not as expected");
		}
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(1500);
		String duplicateLeadName = driver.findElementById("viewLead_firstName_sp").getText();
		if (leadName.equals(duplicateLeadName))
		{
			System.out.println("Duplicate Lead Name is same as Original Lead Name - " + duplicateLeadName);
		}
		else
		{
			System.out.println("The Duplicate Lead Name is not same as Original Lead Name");
		}
		Thread.sleep(1000);  
		driver.close();

	}

}
