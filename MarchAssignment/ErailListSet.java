package MarchAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErailListSet 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://erail.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[contains(@id, 'chkSelectDateOnly')]").click();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("NCJ", Keys.TAB);
		WebDriverWait waits = new WebDriverWait(driver, 10);
		waits.until(ExpectedConditions.elementToBeSelected(driver.findElementByXPath("//table[@class = 'DataTable TrainList TrainListHeader']")));
		WebElement trnTable = driver.findElementByXPath("//table[@class = 'DataTable TrainList TrainListHeader']");
		List<WebElement> allrows = trnTable.findElements(By.tagName("tr"));
		int rowCount = allrows.size();
		System.out.println("Total rows = " + rowCount);
		//get all the rows
		List<String> trn = new ArrayList<String>();
		for (int i = 0; i<rowCount; i++)
		{
			WebElement eachRow = allrows.get(i);
			List<WebElement> eachColumn = eachRow.findElements(By.tagName("td"));
			WebElement trainName = eachColumn.get(1);
			String trainName1 = trainName.getText();
			System.out.println(trainName1);
			trn.add(trainName1);
		}
		System.out.println("Size in the list: " + trn.size());
		
		Set<String> trnSet = new HashSet<String>();
		trnSet.addAll(trn);
		System.out.println(trnSet);
		
	}

}
