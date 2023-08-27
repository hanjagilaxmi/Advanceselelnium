package Popup30thmay;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/Fileuploadpopup.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\deepa\\OneDrive\\Desktop\\QSP");
		Thread.sleep(2000);
		driver.close();
	}
}
