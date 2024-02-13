package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver	= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://instagram.com");
        Thread.sleep(2000);
       WebElement senduser = driver.findElement(By.name("username"));
        senduser.sendKeys("Khushalchouriya1@gmail.com");
        
        WebElement sendpass = driver.findElement(By.name("password"));
        sendpass.sendKeys("12345");
        
        WebElement loginbutton = driver.findElement(By.className( "_acan _acap _acas _aj1- _ap30"));
        loginbutton.click();
        
	}

}
