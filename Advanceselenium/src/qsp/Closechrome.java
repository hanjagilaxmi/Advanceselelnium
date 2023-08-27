package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Closechrome {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.quit();
	}
	
}
