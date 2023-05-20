package week4.day2.Assignment;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		
//1. Launch Salesforce application https://login.salesforce.com/
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//2. Login with username as "hari.radhakrishnan@qeagle.com" 
//and password as "Leaf@1234"
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		
//3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		//Handle the new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow=new ArrayList<String>(windowHandles);
		//Switch to the Confirm redirect
        driver.switchTo().window(listWindow.get(1));
      //Print the Title of the Current Window
        //System.out.println( driver.getTitle());
      
//4. Click confirm on Confirm redirect
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        
//5.Get the title
        System.out.println(driver.getTitle());
        
//6.Get back to the parent window
        driver.switchTo().window(listWindow.get(0));
      
//7. Close the browser
      //  driver.quit();
	}
}
