package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		
           WebDriver driver	= new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.facebook.com/");
           Thread.sleep(2000);
          WebElement senduser = driver.findElement(By.id("email"));
           senduser.sendKeys("Khushalchouriya1@gmail.com");
           
           WebElement sendpass = driver.findElement(By.id("pass"));
           sendpass.sendKeys("12345");
           
           WebElement loginbutton = driver.findElement(By.tagName("button"));
           loginbutton.click();
           
           
           
           
          
            
           

	}

}
