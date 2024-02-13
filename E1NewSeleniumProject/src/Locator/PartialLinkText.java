package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver	= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       WebElement partOflink = driver.findElement(By.partialLinkText("Forgotten"));
       partOflink.click();
	}

}
