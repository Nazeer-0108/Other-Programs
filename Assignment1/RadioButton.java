package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);

		//Radio button - Are you enjoying the classes?
		driver.findElementByXPath("//*[@id=\"first\"]/label[1]").click();
		System.out.println("Are you enjoying the classes? " + driver.findElementByXPath("//*[@id=\"first\"]/label[1]").getText());
		
		//Find default selected radio button
		//System.out.println("Default selected radio button " + driver.findElementByName("news").getAttribute("value"));
		if (driver.findElementByXPath("(//input[@type='radio'])[3]").isSelected())
		{
			System.out.println(driver.findElementByXPath("//label[contains(@for, 'Unchecked')]").getText());
		}
		else if (driver.findElementByXPath("(//input[@type='radio'])[4]").isSelected())
		{
			System.out.println(driver.findElementByXPath("//label[contains(@for, 'Checked')]").getText());
		}
		else
		{
			System.out.println("None is selected");
		}
		
		
		
		//System.out.println("Default selected radio button " + driver.findElementByTagName("input").getAttribute("value"));
		
		/*if (bt1.equals("1"))
		{
			System.out.println("Selected radio button is Checked");
		}
		else if (bt1.equals("0"))
		{
			System.out.println("Selected radio button is Unchecked");
		}
		else
		{
			System.out.println("No radio buttons are selected");
		}*/
		
		driver.close();
	}
	
}
