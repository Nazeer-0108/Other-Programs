package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest 
{
	public static void main(String[] args) 
	{
		//To open the Chrome browser
		//System.setProperty(key, value)
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//Classname obj = new Classname ()
		ChromeDriver driver = new ChromeDriver();
		
		//To launch URL - 2 methods
		//1 - driver.get(URL)
		driver.get("http://leaftaps.com/opentaps/");
		
		//2 - driver.navigate().to(URL); - Syntax
		//driver.navigate().to("http://leaftaps.com/opentaps/");
		
		//To maximize the browser
		//driver.manage().window().maximize();
		
		// To fetch the title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is: " + pageTitle);
		
		//Username field
		WebElement txtUsername = driver.findElementById("username");
		txtUsername.sendKeys("DemoSalesManager");
						
		//Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Login button
		WebElement btnLogin = driver.findElementByClassName("decorativeSubmit");
		btnLogin.click();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//Click link CRM/SFA in the welcome page
		System.out.println("CRMSFA page");
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click link Leads in the CRM/SFA page
		System.out.println("My Home page");
		driver.findElementByLinkText("Leads").click();
		
		System.out.println("My Leads page");
		driver.findElementByLinkText("Create Lead").click();
		
		System.out.println("Create Lead page");
		WebElement txtCompanyname = driver.findElementById("createLeadForm_companyName");
		txtCompanyname.sendKeys("Test Leaf");
		
		WebElement txtFirstname = driver.findElementById("createLeadForm_firstName");
		txtFirstname.sendKeys("Nazeer");
		
		WebElement txtLastname = driver.findElementById("createLeadForm_lastName");
		txtLastname.sendKeys("Hussain");
		
		WebElement eleDD1 = driver.findElementById("createLeadForm_dataSourceId");
		Select sourceDD = new Select(eleDD1);
		sourceDD.selectByVisibleText("Employee");
		System.out.println("Source Dropdown: " + sourceDD);
		
		WebElement eleDD2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketingDD = new Select(eleDD2);
		marketingDD.selectByValue("CATRQ_AUTOMOBILE");
		System.out.println("Marketing Campign dropdown: " + marketingDD);
		
		WebElement eleDD3 = driver.findElementById("createLeadForm_industryEnumId");
		Select industryDD = new Select(eleDD3);
		industryDD.selectByIndex(3);
		System.out.println("Industry dropdown: " + industryDD);
		
		List<WebElement> indOptions = industryDD.getOptions();
		int indSize = indOptions.size();
		System.out.println("Size of Indusrty dd: " + indSize);
		for (int i=0; i < indSize; i++)
		{
			WebElement eachOption = indOptions.get(i);
			System.out.println("Each Option	 " + i + ". " + eachOption.getText());
		}
		
		
		
		
		/*driver.findElementByClassName("smallSubmit").click();
		
		System.out.println("View Lead page");
		driver.findElementByLinkText("Logout").click();
*/		
		// To close the browser
		driver.close();

	}

}
