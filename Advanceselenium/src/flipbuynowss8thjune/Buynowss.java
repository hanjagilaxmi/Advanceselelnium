package flipbuynowss8thjune;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Buynowss {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement rclk=driver.findElement(By.xpath("//div[text()='Cellecor E6+']"));
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
		driver.switchTo().window(s1);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy('+x','+y')");
		TakesScreenshot st=(TakesScreenshot)driver;
		File src=st.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\deepa\\OneDrive\\Desktop\\QSP\\Facebook\\buynow.jpeg");
		FileHandler.copy(src,dst);
		driver.quit();
	}
}
