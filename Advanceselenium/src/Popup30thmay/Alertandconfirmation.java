package Popup30thmay;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertandconfirmation {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String t = a.getText();
		System.out.println(t);
		a.accept();
		driver.close();
	}
}
