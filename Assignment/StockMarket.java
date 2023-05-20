package week4.day2.Assignment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class StockMarket {

	public static void main(String[] args) {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		 //Declare the driver
		ChromeDriver driver=new ChromeDriver();	 
	    //Load the URL
	    driver.get("https://www.chittorgarh.com/");
	    //maximize the browser
	    driver.manage().window().maximize();
	    //Provide duration of waiting time for overall process
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		
//	Click on stock market	
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
//Click on NSE bulk Deals
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
//Get all the Security names
       //Scoral
		//WebElement element = driver.findElement(By.xpath("(//a[text()='Axita Cotton Limited'])[1]"));
		//Actions scoral=new Actions(driver);
		//scoral.moveToElement(element).perform();
		System.out.println("Security Names");
		System.out.println("==============");
		WebElement secName = driver.findElement(By.xpath("(//table[contains(@class,'table table-bordered')])[1]//a[1]"));
	     List<WebElement> lstElement = secName.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//tr//td[1]"));
	    for (int i = 0; i < lstElement.size(); i++) {
	    	System.out.println(lstElement.get(i).getText());
			
		} 
	    
	    System.out.println("=======================");
//Ensure whether there are duplicate Security names
	    Set<WebElement> dupName=new LinkedHashSet<WebElement>(lstElement);
	    if (lstElement.size()==dupName.size() ) {
	    	System.out.println("Duplicate Present");			
		}
	    else {
			System.out.println("Duplicate Not Present");
		}	
	}

}





