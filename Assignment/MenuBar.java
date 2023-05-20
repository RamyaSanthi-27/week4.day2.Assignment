package week4.day2.Assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MenuBar {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//To disable the notification
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Locate The Element
		//Menu Bar
		//Customers
		    WebElement customermenu = driver.findElement(By.xpath("//span[text()='Customers']"));
		    WebElement newmenu = driver.findElement(By.xpath("//span[text()='New']"));
		    WebElement editmenu = driver.findElement(By.xpath("//span[text()='Edit']"));
		    WebElement custmenu = driver.findElement(By.xpath("//span[text()='Customer']"));
		    WebElement duplicatemenu = driver.findElement(By.xpath("//span[text()='Duplicate']"));
		   
		 //Orders
		    WebElement ordermenu = driver.findElement(By.xpath("//span[text()='Orders']"));
		    WebElement viewmenu = driver.findElement(By.xpath("//span[text()='View']"));
		    WebElement searchmenu = driver.findElement(By.xpath("//span[text()='Search']"));
		    
		//Shipments 
		    WebElement shipmentmenu = driver.findElement(By.xpath("//span[text()='Shipments']"));
		    WebElement trackmenu = driver.findElement(By.xpath("//span[text()='Tracker']"));
		    WebElement mapmenu = driver.findElement(By.xpath("//span[text()='Map']"));
		    WebElement managemenu = driver.findElement(By.xpath("//span[text()='Manage']"));
		    
		    
		//Profile		    
		    WebElement profilemenu = driver.findElement(By.xpath("//span[text()='Profile']"));
		    WebElement settingmenu = driver.findElement(By.xpath("//li[@class='ui-menuitem ui-widget ui-corner-all']//span[text()='Settings']"));
		    WebElement billingmenu = driver.findElement(By.xpath("//span[text()='Billing']"));
		    
		    
		  //Action class
		    Actions act=new Actions(driver);
		  //Move a mouse cursor to a specific element
		    act.moveToElement(customermenu);
		  //Click the menu
		    act.click(customermenu);
		  //Click the Submenu
		    act.click(newmenu);
		    Thread.sleep(1000);
		    act.click(custmenu);
		    Thread.sleep(1000);
		  //Move a cursor to a Particular element
		    act.moveToElement(customermenu);
		    act.click(customermenu);
		    act.click(newmenu);
		    act.click(duplicatemenu);
		    act.build().perform();
		  //Move a cursor to a Particular element
		    act.moveToElement(customermenu);
		    act.click(customermenu);
		    act.click(editmenu);
		    act.build().perform();
		    Thread.sleep(1000);
		    act.moveToElement(ordermenu);
		    act.click(ordermenu);
		    act.click(viewmenu);
		    act.build().perform();
		    Thread.sleep(1000);
		    act.moveToElement(ordermenu);
		    act.click(ordermenu);
		    act.click(searchmenu);
		    act.build().perform();
		    act.moveToElement(shipmentmenu);
		    act.click(shipmentmenu);
		    act.click(trackmenu);
		    act.build().perform();
		    Thread.sleep(1000);
		    act.moveToElement(shipmentmenu);
		    act.click(shipmentmenu);
		    act.click(mapmenu);
		    act.build().perform();
		    act.moveToElement(shipmentmenu);
		    act.click(shipmentmenu);
		    act.click(managemenu);
		    act.build().perform();
		    Thread.sleep(1000);
		    act.moveToElement(profilemenu);
		    act.click(profilemenu);
		    act.click(settingmenu);
		    act.build().perform();
		    Thread.sleep(1000);
		    act.moveToElement(profilemenu);
		    act.click(profilemenu);
		    act.click(billingmenu);
		    act.build().perform();
	 //Close the window
		    driver.quit();
		
		

	}

}
