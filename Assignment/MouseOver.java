package week4.day2.Assignment;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		/*Assignment 1:Nykaa
		===================
		1) Go to https://www.nykaa.com/
		2) Mouseover on Brands and Search L'Oreal Paris
		3) Click L'Oreal Paris
		4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		5) Click sort By and select customer top rated
		6) Click Category and click Hair->Click haircare->Shampoo
		7) Click->Concern->Color Protection
		8)check whether the Filter is applied with Shampoo
		9) Click on L'Oreal Paris Colour Protect Shampoo
		10) GO to the new window and select size as 175ml
		11) Print the MRP of the product
		12) Click on ADD to BAG
		13) Go to Shopping Bag 
		14) Print the Grand Total amount
		15) Click Proceed
		16) Click on Continue as Guest
		17) Check if this grand total is the same in step 14
		18) Close all windows*/

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
		
		Actions Builder=new Actions(driver);
		Builder.moveToElement(findElement).perform();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'oreal Paris");
        driver.findElement(By.xpath("(//a[contains(text(),'Oreal Paris')])[1]")).click();
        System.out.println(driver.getTitle());
        driver.getWindowHandle();
        
        WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Sort By : popularity']"));
        Builder.click(findElement3).perform();
        
        WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='control-box css-9rrbqm']/label)[4]"));
        Builder.click(findElement2).perform();
        driver.findElement(By.xpath("//span[text()='Category']")).click();
        driver.findElement(By.xpath("//span[text()='Hair']")).click();
        
        WebElement findElement4 = driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]"));
        Builder.click(findElement4).release().perform();
        driver.findElement(By.xpath("//span[text()='Shampoo']/..")).click();
        driver.findElement(By.xpath("//span[text()='Concern']/..")).click();      
        driver.findElement(By.xpath("//span[text()='Color Protection']")).click();      
        String text = driver.findElement(By.xpath("//div[@class='css-19j3ean']")).getText();
        System.out.println(text);  
        driver.findElement(By.xpath("//div[@class='css-d5z3ro']")).click();
       
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> lstwindow=new ArrayList<String>(windowHandles);
        driver.switchTo().window(lstwindow.get(1));
        driver.findElement(By.xpath("(//span[@class=' css-d3w64v']/..)[1]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
       
        WebElement findElement5 = driver.findElement(By.xpath("(//*[name()='svg' and @viewBox='0 0 24 24']//*[local-name()='path'])[10]"));
       Builder.click(findElement5).release().perform();    
       driver.switchTo().frame(0);
       String text2 = driver.findElement(By.xpath("(//p[@class='css-masf0q eka6zu20'])[2]")).getText();
       System.out.println("The Grand Total amount :"+text2);
       driver.findElement(By.xpath("//span[text()='Proceed']")).click();
       driver.getWindowHandle();
       driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
     
       WebElement findElement6 = driver.findElement(By.xpath("//div[@class='css-65fmv9 emgron30']"));
       Builder.click(findElement6).perform();
       String text3 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
       
       if (text2.equals(text3)) {
           System.out.println("Match the Grand total .");
       } else {
           System.out.println("Does not Match the Grand total.");
       }
       
		
	}	

}
