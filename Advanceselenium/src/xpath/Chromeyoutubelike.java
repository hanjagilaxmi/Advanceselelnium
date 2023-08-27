package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeyoutubelike {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kfg trailer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='channel-info']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='segmented-like-button']")).click();
	}
}
