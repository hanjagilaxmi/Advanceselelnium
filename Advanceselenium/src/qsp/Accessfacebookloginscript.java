package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accessfacebookloginscript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("hanjagilaxmi8@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("laxmi");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();		
	}
}
