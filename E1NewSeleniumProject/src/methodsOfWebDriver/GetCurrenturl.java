package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrenturl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000); 
        String pageurl = driver.getCurrentUrl();
        driver.close();
        System.out.println(pageurl);
	}

}
