package week4.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Maximize the window
	    driver.manage().window().maximize();
	    //Declare the URL
	    driver.get("https://www.leafground.com/drag.xhtml");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //The source point where from the drag
	    WebElement source = driver.findElement(By.xpath("//div[@id='form:drag']"));
	    System.out.println(source.getText());
	    //Destination 
	    WebElement dest = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
	    System.out.println(dest.getText());
	    
	    Actions builder=new Actions(driver);
	    builder.dragAndDrop(source, dest).perform();
	    //WebElement dest = driver.findElement(By.xpath("//p[text()='Dropped!']"));
	    //verification
	    String text = dest.getText();
	    System.out.println(text);
        //drag and drop element in webelement
        WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Point location = drag.getLocation();
		//Get starting point to drag
		int x = location.getX();
		//Get ending point to drop
		int y = location.getY();
		//Print x-axis and y-axis
		System.out.println("Drag Point x: "+x);
		System.out.println("Drop Point y: "+y);
		Actions dragact=new Actions(driver);
		//Set source and destination point
		dragact.dragAndDropBy(drag, 300, 100).perform();
		System.out.println("Total Point of Drog  : " +drag.getLocation().getX());
		System.out.println("Total Point of Drog  : " +drag.getLocation().getY());
		
		
		
		
		
		
			}

}
