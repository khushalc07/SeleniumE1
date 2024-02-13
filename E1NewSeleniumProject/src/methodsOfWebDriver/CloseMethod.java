package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException 
	{
           WebDriver driver = new ChromeDriver();// to launch the browser
           Thread.sleep(5000);// to stop the execution  for sometime(5 second)
           driver.close();// To close the browser window.
	}

}
