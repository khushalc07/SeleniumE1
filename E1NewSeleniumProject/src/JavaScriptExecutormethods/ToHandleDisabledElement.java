package JavaScriptExecutormethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoapps.qspiders.com/ui");
        
        driver.findElement(By.xpath("//li[text()='Disabled']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('name').value='admin'");
        Thread.sleep(5000);
         
        js.executeScript("document.getElementById('name').value=''");
        

       
        
	}

}
