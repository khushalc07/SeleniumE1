package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// to launch the web application
		Thread.sleep(1000);
		driver.manage().window().maximize();// to maximize the window
		Thread.sleep(1000);
		
		driver.get("https://omayo.blogspot.com/");// to launch the web application
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Open a popup window")).click();// to open the the (new)child window
		Thread.sleep(1000);
		
		driver.quit();// to close parent and as well as child window
		
		//driver.close();// only to close the parent window
	}

}
