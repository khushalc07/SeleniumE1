package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15) );
		 driver.get("https://trello.com/home");
		 
		 driver.findElement(By.partialLinkText("Log in")).click();
		 driver.findElement(By.id("username")).sendKeys("Khushalchouriya1@gmail.com");
		 driver.findElement(By.xpath("//span[text()='Continue']")).click();
		 driver.findElement(By.id("password")).sendKeys("Khushal2024@");
		 driver.findElement(By.xpath("//span[text()='Log in']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//div[text()='Demo1']")).click();
		 
		 //Source
		 WebElement Sqlmock = driver.findElement(By.xpath("//a[text()='SQL']"));
		 WebElement javamock = driver.findElement(By.xpath("//a[text()='JAVA']"));
		 WebElement manualTmock = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		 WebElement apimock = driver.findElement(By.xpath("//a[text()='API']"));
		 WebElement seleniumMock = driver.findElement(By.xpath("//a[text()='Selenium']"));
		 
	      //Target
		WebElement Mockgiven = driver.findElement(By.xpath("//textarea[text()='Mock Given']"));
		WebElement MockPending = driver.findElement(By.xpath("//textarea[text()='Mock Pending']"));
		WebElement MockSchedule = driver.findElement(By.xpath("//textarea[text()='Mock Scheduled']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(javamock, MockSchedule).perform();
		act.dragAndDrop(Sqlmock, Mockgiven).perform();
		act.dragAndDrop(seleniumMock, MockSchedule).perform();
		act.dragAndDrop(apimock, MockSchedule).perform();
		act.dragAndDrop(manualTmock, Mockgiven).perform();
		
		
	}

}
