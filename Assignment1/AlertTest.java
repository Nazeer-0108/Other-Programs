package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebElement testFrame = driver.findElementByXPath("//iframe[@id="iframeResult"]");
		WebElement testFrame = driver.findElementById("iframeResult");
		driver.switchTo().frame(testFrame);
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		Alert testAlert = driver.switchTo().alert();
		//testAlert.sendKeys("");
		testAlert.sendKeys("Nazeer");
		testAlert.accept();
		//driver.switchTo().frame(testFrame);
		String alertText = driver.findElementByXPath("//p[contains(text(), 'Hello')]").getText();
		System.out.println("The alert text is: " + alertText);
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		Set <String> setWin = driver.getWindowHandles();
		List<String> lstWin = new ArrayList<String>(setWin);
		driver.switchTo().window(lstWin.get(1));
		System.out.println("Title: " + driver.getTitle());
		String winText = driver.findElementByXPath("(//a[@class = 'w3schools-logo'])[1]").getText();
		System.out.println("Text: " + winText);
		
		
//		driver.close();	
		
	}
}