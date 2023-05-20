package week4.day2.Assignment;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RowandColumnCount {

	public static void main(String[] args) {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		 //Declare the driver
		ChromeDriver driver=new ChromeDriver();	 
	    //Load the URL
	    driver.get("https://html.com/tags/table/");
	    //maximize the browser
	    driver.manage().window().maximize();
	    //Provide duration of waiting time for overall process
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //Get the count of number of rows
        List<WebElement> rouCount=driver.findElements(By.xpath("(//table[@class='attributes-list'])[1]//tr"));
        System.out.println("Numer of Rows : "+rouCount.size());
        //Get the count of number of columns
        List<WebElement>columnCount=driver.findElements(By.xpath("(//table[@class='attributes-list'])[1]//tr/td"));
        System.out.println("Numer of Rows : "+columnCount.size());
	}

}
/*Assignment2:
============
1. Launch the URL https://html.com/tags/table/
2. Get the count of number of rows
3. Get the count of number of columns
*/