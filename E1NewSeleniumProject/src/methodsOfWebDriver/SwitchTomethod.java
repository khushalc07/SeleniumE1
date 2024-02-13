package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTomethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        Thread.sleep(2000);
        
        driver.switchTo().activeElement().sendKeys("https://in.linkedin.com/in/khushal-chouriya-711468230",Keys.ENTER);
	}

}
