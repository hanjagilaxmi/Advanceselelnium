package ninteenmay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("laxmiaravind1997@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		
	}
	
}
