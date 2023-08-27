package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginInstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laxaravind");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hanjagi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
