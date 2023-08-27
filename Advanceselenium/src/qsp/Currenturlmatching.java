package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Currenturlmatching {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.facebook.com/"))
		{
			System.out.println("matching");
		}
		else
		{
			System.out.println("not matching");
		}
	}
}
