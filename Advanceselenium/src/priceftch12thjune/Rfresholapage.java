package priceftch12thjune;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rfresholapage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.olacabs.com/");
		for(int i=0;i<=100;i++)
		{
			driver.navigate().refresh();
		}
		//driver.close();
	}
}
//For this type of application we will not able to refresh the page for mentioned number 
//of time and it will thorw 404 or 403 error.
