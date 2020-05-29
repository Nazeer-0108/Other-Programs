package TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginFuncTest
{
	public ChromeDriver driver;
	@BeforeMethod
	public void Login() 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://leaftaps.com/opentaps/");
		WebElement txtUsername = driver.findElementById("username");
		txtUsername.sendKeys("DemoSalesManager");
		WebElement txtPassword = driver.findElementById("password");
		txtPassword.sendKeys("crmsfa");
		WebElement btnLogin = driver.findElementByClassName("decorativeSubmit");
		btnLogin.click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void Logout() 
	{
		driver.close();
	}
}
