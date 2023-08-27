package javascript7thjune;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltospeceficelement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Germany')]"));
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy('+x','+y')");
		driver.findElement(By.xpath("//a[contains(text(),'Germany')]")).click();
	}
}
