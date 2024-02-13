package ActionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropmethod {

	public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15) );
		 driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		 
		 WebElement MouseAction = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		 MouseAction.click();
		 
		 WebElement DragAndDrop = driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
		 DragAndDrop.click();
		 
		 WebElement Dragpostion = driver.findElement(By.partialLinkText("Drag Position"));
		 Dragpostion.click();
		  
		 //mobile and laptop source Webelement
		  WebElement mobileChg = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		  WebElement laptopchg = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		  WebElement mobilecover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		  WebElement laptopcover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
                   
		  // moible and laptop target Webelement
          WebElement MobileAcc = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
          WebElement LaptopAcc = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		   
          Actions act = new Actions(driver);
          //To drag and drop the webelement into respective target area
		  act.dragAndDrop(laptopchg, LaptopAcc).perform();
		  act.dragAndDrop(laptopcover, LaptopAcc).perform();
		  act.dragAndDrop(mobileChg, MobileAcc).perform();
		  act.dragAndDrop(mobilecover, MobileAcc).perform();


		
		 
		 
		 
	}

}
