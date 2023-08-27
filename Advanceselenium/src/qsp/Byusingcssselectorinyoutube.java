package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byusingcssselectorinyoutube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kfg trailer");
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		driver.findElement(By.cssSelector("div[id='channel-info']")).click();
	}
}
