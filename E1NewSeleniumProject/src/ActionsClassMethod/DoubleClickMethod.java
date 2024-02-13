package ActionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver	=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15) );
		 driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		 
		Actions act = new Actions(driver);
		 
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		act.click(button).perform();
		
		WebElement DoubleClickButton = driver.findElement(By.partialLinkText("Double Click"));
		act.click();
		
	}

}
