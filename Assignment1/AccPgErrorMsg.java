package Assignment1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AccPgErrorMsg 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/");
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
		//Create Account
		driver.findElementByLinkText("Create Account").click();
//		WebElement accName = driver.findElementById("accountName");
//		accName.sendKeys("ARS");
		WebElement localName = driver.findElementById("groupNameLocal");
		localName.sendKeys("ARS");
		WebElement eleOwner = driver.findElementByName("ownershipEnumId");
		Select ownershipDD = new Select(eleOwner);
		ownershipDD.selectByVisibleText("Public Corporation");
		WebElement eleSource = driver.findElementByName("dataSourceId");
		Select sourceDD = new Select(eleSource);
		sourceDD.selectByIndex(9);
		WebElement desc = driver.findElementByName("description");
		desc.sendKeys("NRI Account");
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(3000);
		String errHeader = driver.findElementByClassName("errorMessageHeader").getText();
		System.out.println("Error Message header: " + errHeader);
		String errMessage = driver.findElementByClassName("errorMessage").getText();
		System.out.println("Error Message: " + errMessage);
		System.out.println("Error displayed:" + errHeader + " " + errMessage);
		driver.close();
	}
}


