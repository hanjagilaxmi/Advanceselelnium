package Popup31stmay;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchtoeverytab {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Blog']"));
		ArrayList<WebElement> a=new ArrayList<>();
		{
			a.add(ele);
			a.add(ele1);
			a.add(ele2);
			a.add(ele3);
			a.add(ele4);
		}
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		for (WebElement w : a) 
		{
			ac.contextClick(w).perform();
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		Set<String> all = driver.getWindowHandles();
		ArrayList<String> a2=new ArrayList<>();
		for (String w1 : all) 
		{
			a2.add(w1);
		}
		int count=a2.size();
		for(int i=0;i<count;i++)
		{
		String l=a2.get(i);
		Thread.sleep(2000);
		driver.switchTo().window(l);
		Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
