package PropertyFile;

import org.openqa.selenium.remote.RemoteWebDriver;
public class LoginPage extends ProjectSpecificationMethod 
{
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage enterUserName (String data)
	{
		driver.findElementById(prop.getProperty("login.uname.id")).sendKeys(data);
		return this;
	}
	
	public LoginPage enterPassword (String data)
	{
		driver.findElementById(prop.getProperty("login.pwd.id")).sendKeys(data);
		return this;
	}
	
	public HomePage clickLogin()
	{
		driver.findElementByClassName(prop.getProperty("login.login.class")).click();
		return new HomePage(driver);
	}
}
