package week4.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		 //Declare the driver
		ChromeDriver driver=new ChromeDriver();	 
	    //Load the URL
	    driver.get("https://jqueryui.com/droppable/");
	    //maximize the browser
	    driver.manage().window().maximize();
	    //Provide duration of waiting time for overall process
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //Locate the Element
	    //Switch to Frame
	    driver.switchTo().frame(0);
	    WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	    System.out.println(source.getText());
	    
	    WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
	    System.out.println(dest.getText());
	    
	    Actions builder=new Actions(driver);
	    builder.dragAndDrop(source, dest).perform();
	    //WebElement dest = driver.findElement(By.xpath("//p[text()='Dropped!']"));
	    //verification
	    String text = dest.getText();
	    System.out.println(text);
	  

	}

}
