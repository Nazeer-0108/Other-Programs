package Assignment1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//To open the Chrome browser
		//System.setProperty(key, value)
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//Classname obj = new Classname ()
		ChromeDriver driver = new ChromeDriver();
		
		//To launch URL
		driver.navigate().to("http://leaftaps.com/opentaps/");
		
		//To maximize the browser
		//driver.manage().window().maximize();
		
		// To fetch the title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is: " + pageTitle);
		WebElement txtUsername = driver.findElementById("username");
		txtUsername.sendKeys("DemoSalesManager");
		WebElement txtPassword = driver.findElementById("password");
		txtPassword.sendKeys("crmsfa");
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
/*		driver.findElementByLinkText("Create Lead").click();
		
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
		WebElement eleDD2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketingDD = new Select(eleDD2);
		marketingDD.selectByValue("CATRQ_AUTOMOBILE");
		WebElement eleDD3 = driver.findElementById("createLeadForm_industryEnumId");
		Select industryDD = new Select(eleDD3);
		industryDD.selectByIndex(3);
 		
		driver.findElementByClassName("smallSubmit").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String resultpageTitle = driver.getTitle();
		System.out.println("Title of the result page is: " + resultpageTitle);
	*/
		//Edit Lead
		driver.findElementByXPath("//a[contains(@href, 'findLeads')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//input[@name = 'firstName'])[3]").sendKeys("Gopi");
		driver.findElementByXPath("(//tbody/tr//em[@unselectable='on']/button[@class='x-btn-text'])[7]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Edit").click();
		System.out.println("Click Edit");
		Thread.sleep(3000);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Java-Selenium");
		driver.findElementByXPath("//input[contains(@name, 'submitButton')][1]").click();
		Thread.sleep(3000);
		String compName = driver.findElementById("viewLead_companyName_sp").getText();
		String[] updatedcompName = compName.split(" ");
		for (int i = 0; i < updatedcompName.length; i++) 
		{
			System.out.println(updatedcompName[i]);
		}
		System.out.println(updatedcompName[0]);
		// To close the browser
		driver.close();
	}
}
