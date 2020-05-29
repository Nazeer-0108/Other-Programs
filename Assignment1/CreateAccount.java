package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
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
		System.out.println("CRMSFA page");
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
/*		//Create Account
		driver.findElementByLinkText("Create Account").click();
		WebElement accName = driver.findElementById("accountName");
		accName.sendKeys("ARS");
		WebElement localName = driver.findElementById("groupNameLocal");
		localName.sendKeys("ARS");
		WebElement eleOwner = driver.findElementByName("ownershipEnumId");
		Select ownershipDD = new Select(eleOwner);
		ownershipDD.selectByVisibleText("Public Corporation");
		WebElement eleSource = driver.findElementByName("dataSourceId");
		Select sourceDD = new Select(eleSource);
		sourceDD.selectByIndex(9);
		WebElement desc = driver.findElementByName("description");
		desc.sendKeys("Test Leaf testing");
		driver.findElementByClassName("smallSubmit").click();
		
		//Find Account
	*/	driver.findElementByLinkText("Find Accounts").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("(//input[@name ='accountName'])[2]").sendKeys("Nazeer Hussain");
		driver.findElementByXPath("//button[text() = 'Find Accounts']").click();
		Thread.sleep(3000);
//		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[1]").click();
		Thread.sleep(3000);
		//Accounts Details page
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(3000);
		//String editpageTitle = driver.getTitle();
		if (driver.getTitle().equals("Edit Account | opentaps CRM") )
		{
			//System.out.println(editpageTitle);
			System.out.println("Page title is displayed as expectd: " + driver.getTitle());
		}
		else
		{
			System.out.println("Page title is not as expected");
		}
		//String accholderName = driver.findElementById("accountName").getAttribute("value");
		//System.out.println("Account Name: " + accholderName);
		if (driver.findElementById("accountName").getAttribute("value").equals("Nazeer Hussain"))
		{
			System.out.println("Account name is displayed as expected: " + driver.findElementById("accountName").getAttribute("value"));
		}
		else
			System.out.println("Acount Name is not as expected");
		
		String descText = driver.findElementByName("description").getText();
		System.out.println("Description Text: " + descText);
		driver.close();
	}
}
