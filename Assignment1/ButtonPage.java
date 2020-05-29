package Assignment1;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage 
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
		driver.get("http://leafground.com/pages/Button.html");
				
		// To fetch the title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is: " + pageTitle);
				
		//Get Position of the button
		//WebElement buttonPositionX = 
		System.out.println("X axis of button: " + driver.findElementById("position").getLocation().getX());
		System.out.println("Y axis of button: " + driver.findElementById("position").getLocation().getY());
		//WebElement buttonPositionX = driver.findElementById("position");
		//buttonPositionX.getLocation().getX();
		//WebElement buttonPositionX = driver.findElementById("position");
		//buttonPositionY.getLocation().getY();
		//System.out.println("Button Position - X: " + buttonPositionX);
		//System.out.println("Y axis of button: " + buttonPositionY);
		
		//Get Color of the button
		String buttonColor = driver.findElementById("color").getCssValue("background-color");
		System.out.println("Button Color:  "+ buttonColor);
		
		//Get size of the button
		int buttonSizeH = driver.findElementById("size").getSize().height;
		int buttonSizeW = driver.findElementById("size").getSize().width;
		System.out.println("Height of the button: " + buttonSizeH);
		System.out.println("Width of the button: " + buttonSizeW);
		
		//Click button to go to home page
		driver.findElementById("home").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Expected text: " + driver.findElementByTagName("h1").getText());
		if(driver.findElementByTagName("h1").getText().contains("Locators and Selenium Interactions"))
		{
			System.out.println("Travel Home Page is displayed");
		}
		else
		{
			System.out.println("Travel Home Page is not displayed");
		}	
		
//		if (pageText = "Locators and Selenium Interactions")
//		{
//			System.out.println("Travel Home Page is displayed");
//		}
//		else
//		{
//			System.out.println("Travel Home Page is not displayed");
//		}
		
		// To close the browser
		driver.close();


	}

}
