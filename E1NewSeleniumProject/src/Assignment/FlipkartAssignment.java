package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");
            Thread.sleep(1000);
            
            driver.findElement(By.name("q")).sendKeys("Hp laptops");
            driver.findElement(By.xpath("//button[@type ='submit']")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("//div[text() = 'Brand']")).click();
            driver.findElement(By.xpath("//div[text() = 'HP']/preceding-sibling::div[@class = '_24_Dny']")).click();
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//div[text() = 'Core i5']/preceding-sibling::div[@class = '_24_Dny']")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("//div[text() = 'RAM Capacity']")).click();
            driver.findElement(By.xpath("//div[text()='8 GB']/preceding-sibling::div[@class = '_24_Dny']")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("//div[text() = 'Operating System']")).click();
            driver.findElement(By.xpath("//div[text() = 'Windows 11']/preceding-sibling::div[@class ='_24_Dny']")).click();
            
            
            driver.findElement(By.xpath("//div[text() ='4★ & above']/preceding-sibling::div[@class ='_24_Dny']")).click();
            
	}

}
