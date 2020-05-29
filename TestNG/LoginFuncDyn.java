package TestNG;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import ReadExecl.ReadExcel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginFuncDyn
{
	public ChromeDriver driver;
	public String excelFile;
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
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		ReadExcel rd = new ReadExcel();
		String [][] data =  rd.readExcel(excelFile);
		return data;
	}
	/*public String[][] getData()
	{
		String [][] data = new String [2][4];
		data[0][0] = "Testleaf";
		data[0][1] = "Balaji";
		data[0][2] = "Baajji";
		data[0][3] = "7896541459";
		
		data[1][0] = "Testleaf";
		data[1][1] = "Gopi";
		data[1][2] = "Jai";
		data[1][3] = "7894781459";
		
		return data;
	}*/
	

}