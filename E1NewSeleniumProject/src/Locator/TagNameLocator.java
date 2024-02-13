package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// to launch the web application
		Thread.sleep(1000);
	    driver.get("file:///C:/Users/Khushal/Desktop/WebElements/Textbox.html");
	    Thread.sleep(2000);
	  WebElement textbox = driver.findElement(By.tagName("input"));
	  textbox.sendKeys("Manager");
	  
	}

}
