package Popup30thmay;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddendivisionpopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='31']")).click();
	}
}
