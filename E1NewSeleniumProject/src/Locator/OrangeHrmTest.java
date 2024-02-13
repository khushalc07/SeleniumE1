package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver	= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
       WebElement usertext = driver.findElement(By.name("username"));
       usertext.sendKeys("Admin");
       WebElement passtext = driver.findElement(By.name("password"));
       passtext.sendKeys("admin123");
       driver.findElement(By.tagName("button")).click();
        
        
	}

}
