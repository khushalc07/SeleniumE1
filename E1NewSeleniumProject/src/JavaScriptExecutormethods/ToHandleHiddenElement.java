package JavaScriptExecutormethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://en-gb.facebook.com/signup");
        
        WebElement hiddentextbox = driver.findElement(By.xpath("//input[@name='custom_gender']"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='qspiders'",hiddentextbox );
        
	}

}
