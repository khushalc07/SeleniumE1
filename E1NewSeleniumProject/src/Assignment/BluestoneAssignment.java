package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneAssignment {

	public static void main(String[] args) throws InterruptedException {
             WebDriver driver =new ChromeDriver();
             Actions act = new Actions(driver);
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
             driver.get("https://www.bluestone.com/");
             driver.findElement(By.id("denyBtn")).click();
             Thread.sleep(2000);
             WebElement CoinsDD = driver.findElement(By.xpath("//a[text()='Coins ']"));
             act.moveToElement(CoinsDD).perform();
               
             
         
                  
	}

}
