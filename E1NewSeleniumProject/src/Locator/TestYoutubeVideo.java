package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestYoutubeVideo {

	public static void main(String[] args) throws InterruptedException {
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.youtube.com/");
           //Thread.sleep(2000);
           driver.findElement(By.name("search_query")).sendKeys("banayenge mandir short video");
           Thread.sleep(1000);
           driver.findElement(By.id("search-icon-legacy")).click();
           Thread.sleep(2000);
           //driver.findElement(By.id("text")).click();
           driver.findElement(By.partialLinkText("banayenge mandir remix status by sk status 💪🏻🚩#shorts #trending #hindi #attitude")).click();
	}

}
