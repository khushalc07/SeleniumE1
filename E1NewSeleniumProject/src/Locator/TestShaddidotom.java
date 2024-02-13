package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestShaddidotom {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver	= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shaadi.com/");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Login")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("Khushal");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Pass123@");
        
        
	}

}
