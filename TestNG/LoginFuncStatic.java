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
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginFuncStatic
{
	public ChromeDriver driver;
	@Parameters({"url", "uname", "pwd"})
	@BeforeMethod
	public void Login(String url, String uname, String pwd) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		System.out.println("Username & Password entered");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Login button clicked");
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void Logout() 
	{
		driver.close();
	}
}
