package Assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksPage 
{
	public static void main(String[] args) 
	{
		//To open the Chrome browser
		//System.setProperty(key, value)
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
		//Classname obj = new Classname ()
		ChromeDriver driver = new ChromeDriver();
				
		//To maximize the browser
		//driver.manage().window().maximize();

		//To launch URL
		//driver.get(URL)
		driver.get("http://leafground.com/pages/Link.html");
				
		// To fetch the title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is: " + pageTitle);

		//Link -> Go to Home Page
		driver.findElementByLinkText("Go to Home Page").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver.findElementByTagName("h1").getText().contains("Locators and Selenium Interactions"))
		{
			System.out.println("Travel Home Page is displayed on clicking Go to Home Page link");
			driver.findElement(By.cssSelector("a[href*='pages/Link.html']")).click();
			System.out.println("Header text in the Links home page: " + driver.findElementByTagName("h1").getText());
		}
		else
		{
			System.out.println("Travel Home Page is not displayed");
		}	

		//Link -> Find where am supposed to go without clicking me?
		String destURL = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println("Destination URL for the Go To Home Page link is -> " + destURL);
		
		//Link -> Go to Home Page (Interact with same link name)
		driver.findElementByLinkText("Go to Home Page").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver.findElementByTagName("h1").getText().contains("Locators and Selenium Interactions"))
		{
			System.out.println("Travel Home Page is displayed on clicking Go to Home Page (Interact with same link name) link");
			driver.findElement(By.cssSelector("a[href*='pages/Link.html']")).click();
			System.out.println("Header text in the Links home page: " + driver.findElementByTagName("h1").getText());
		}
		else
		{
			System.out.println("Travel Home Page is not displayed");
		}	

		//Link -> How many links are available in this page?
		List<WebElement> findLinks = driver.findElements(By.xpath("//a"));    //Identify the number of Link on webpage and assign into Webelement List 
        int linkCount = findLinks.size();     // Count the total Link list on Web Page
        System.out.println("Total Number of link count on Links webpage = "  + linkCount);    //Print the total count of links on webpage
		for (int i = 0; i<=findLinks.size()-1; i=i+1)
        {
			System.out.println(findLinks.get(i).getText());
        }
        
        
		driver.close();
	}

}
