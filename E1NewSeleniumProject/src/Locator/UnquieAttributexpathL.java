package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnquieAttributexpathL {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://app.fireflink.com/signin");
     Thread.sleep(4000);
     
     //driver.findElement(By.id("rcc-decline-button")).click();
     //Thread.sleep(2000);
     //driver.findElement(By.cssSelector("a[href='https://app.fireflink.com/signin']")).click();
     
     WebElement usertext = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
     usertext.sendKeys("khushalchouriya1@gmail.com");
     
     WebElement passtext = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
     passtext.sendKeys("Pass123@");
     
     WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
     button.click();
     
     
	}

}
