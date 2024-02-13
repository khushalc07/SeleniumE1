package ActionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15) );
		 driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		 
		 WebElement MouseAction = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		 MouseAction.click();
		 
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		WebElement clickAndHold = driver.findElement(By.id("circle"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(clickAndHold).perform();
		Thread.sleep(5000);
	    act.release(clickAndHold).perform();
		
		 
		 
		 
	}

}
