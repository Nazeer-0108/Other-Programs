package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class ActionsClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement tvAppl = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		Actions builder = new Actions(driver);
		builder.moveToElement(tvAppl).perform();
		driver.findElementByXPath("(//a[@title='LG'])[1]").click();
		Thread.sleep(2000);
		String tvName = driver.findElementByXPath("//div[contains(text(), 'LG All-in-One 80cm')]").getText();
		System.out.println("The 1st TV in the list is '" + tvName + "'");
		
		driver.close();
	}
}