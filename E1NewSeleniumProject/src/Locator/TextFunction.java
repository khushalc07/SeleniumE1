package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://127.0.0.1/login.do;jsessionid=706stjstptmpu");
	     Thread.sleep(2000);
	     
	     //driver.findElement(By.xpath("//a[text()='Login']")).click();
	     
	     driver.findElement(By.xpath("//a[.='Login']")).click();
	     
	}

}
