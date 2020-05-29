package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://erail.in");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement dateCheck = driver.findElementById("chkSelectDateOnly");
		if (dateCheck.isSelected())
		{
			dateCheck.click();
			System.out.println("The sort on date is unchecked now");
		}
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("NCJ", Keys.TAB);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Find table element
		WebElement table = driver.findElementByXPath("//table[@class = 'DataTable TrainList TrainListHeader']");
		//find all rows in specific table element
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		//get count of rows
		int rowCount = allrows.size();
		System.out.println("Row count: " + rowCount);

		//to get the 1st row alone
		//pick 1st train in the list from rows
		/*		WebElement firstRow = allrows.get(0);
		//find all the columns of the given web element (1st row)
		List<WebElement> allColumn = firstRow.findElements(By.tagName("td"));
		//get column count
		int columnCount = allColumn.size();
		System.out.println("Column count: " + columnCount);
		WebElement firColumn = allColumn.get(0);
		WebElement secColumn = allColumn.get(1);
		//fetch the train number & name first train in the list
		String trainNum = firColumn.getText();
		String trainName = secColumn.getText();
		System.out.println("Train Number is: " + trainNum + " and Train Name is: " + trainName);
		 */	
		List<String> trn = new ArrayList<String>();
		//get all the rows
		for (int i = 0; i<rowCount; i++)
		{
			WebElement eachRow = allrows.get(i);
			List<WebElement> eachColumn = eachRow.findElements(By.tagName("td"));
			//	WebElement trainNumber = eachColumn.get(0);
			//	String trainNumber1 = trainNumber.getText();
			WebElement trainName = eachColumn.get(1);
			String trainName1 = trainName.getText();
			//	System.out.println("Train Number is: " + trainNumber1 + " and Train Name is: " + trainName1);
			System.out.println(trainName1);
			trn.add(trainName1);
		}
		System.out.println("************************************************");
		System.out.println("1st train in the list before sorting");
		System.out.println(Collections.min(trn));
		System.out.println("************************************************");
		System.out.println("Last train in the list before sorting");
		System.out.println(Collections.max(trn));
		System.out.println("************************************************");
		Collections.sort(trn);
		System.out.println("After sorting");
		for (String trnnames : trn)
		{
			System.out.println(trnnames);			
		}
		System.out.println("************************************************");
		System.out.println("1st train in the list after sorting");
		System.out.println(Collections.min(trn));
		System.out.println("************************************************");
		System.out.println("Last train in the list after sorting");
		System.out.println(Collections.max(trn));
		System.out.println("************************************************");
		driver.close();	
		
	}
}