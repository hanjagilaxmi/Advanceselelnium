package flipistjune;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scripttillpayment {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000); 
		WebElement rclk=driver.findElement(By.xpath("//div[text()='Cellecor E6+']"));
		Thread.sleep(2000); 
		Actions act=new Actions(driver);
		act.contextClick(rclk).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<>();
		for (String s : allwh) 
		{
			a.add(s);
		}
		String s1 = a.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(s1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).sendKeys("8431671768");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		
	}
}
