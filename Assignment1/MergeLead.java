package Assignment1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MergeLead 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement txtUsername = driver.findElementById("username");
		txtUsername.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		WebElement btnLogin = driver.findElementByClassName("decorativeSubmit");
		btnLogin.click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("(//a[@href= '/crmsfa/control/contactsMain'])[1]").click();
		driver.findElementByXPath("(//a[@href= '/crmsfa/control/mergeContactsForm'])").click();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//img[@src= '/images/fieldlookup.gif'])[1]").click();
		
		Set <String> setWin1 = driver.getWindowHandles();
		List<String> lstWin1 = new ArrayList<String>(setWin1);
		driver.switchTo().window(lstWin1.get(1));
		System.out.println(driver.getTitle());
		System.out.println("From Contact: " + driver.findElementByXPath("//a[@class='linktext'][1]").getText());
		driver.findElementByXPath("//a[@class='linktext'][1]").click();

		
		Set <String> setWin2 = driver.getWindowHandles();
		List<String> lstWin2 = new ArrayList<String>(setWin2);
		driver.switchTo().window(lstWin2.get(0));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//img[@src= '/images/fieldlookup.gif'])[2]").click();
		
		Set <String> setWin3 = driver.getWindowHandles();
		List<String> lstWin3 = new ArrayList<String>(setWin3);
		driver.switchTo().window(lstWin3.get(1));
		System.out.println(driver.getTitle());
		System.out.println("To Contact: " + driver.findElementByXPath("(//tbody/tr//div[@unselectable='on']/a[@class='linktext'])[5]").getText());
		driver.findElementByXPath("(//tbody/tr//div[@unselectable='on']/a[@class='linktext'])[5]").click();

		Set <String> setWin4 = driver.getWindowHandles();
		List<String> lstWin4 = new ArrayList<String>(setWin4);
		driver.switchTo().window(lstWin4.get(0));
		System.out.println(driver.getTitle());
		driver.findElementByClassName("buttonDangerous").click();
		
		driver.switchTo().alert().accept();
		System.out.println("Title of the page: " + driver.getTitle());
		
		driver.close();
	}	

}
