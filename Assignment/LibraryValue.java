package week4.day2.Assignment;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LibraryValue {

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
//print the respective values based on given Library
	    List<WebElement> elements = driver.findElements(By.xpath("(//div[@class='render']//tr)[3]"));
	    for (int i = 0; i <elements.size(); i++) {
	    	System.out.println(elements.get(i).getText());
			
		}

	}

	
}
/*Assignment3:
============
1. Launch the URL https://html.com/tags/table/
2. You have to print the respective values based on given Library
(hint: if the library was absolute usage, then print all its value) */



