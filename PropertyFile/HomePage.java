package PropertyFile;

import org.openqa.selenium.remote.RemoteWebDriver;
public class HomePage extends ProjectSpecificationMethod
{
	public HomePage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage clickCRMSFALink()
	{
		System.out.println("CRMSFA Home page to My Home Page");
		driver.findElementByLinkText(prop.getProperty("home.crmsfa.link")).click();
		return this;
	}
	
}

