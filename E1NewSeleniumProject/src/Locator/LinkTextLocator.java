package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver	= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wwww.facebook.com/");
        Thread.sleep(2000);
       WebElement link = driver.findElement(By.linkText("Forgotton password?"));
       link.click();
	}

}
