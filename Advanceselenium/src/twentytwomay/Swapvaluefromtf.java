package twentytwomay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swapvaluefromtf {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/swapvalue.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("a1"));
		ele.sendKeys(Keys.CONTROL + "a","x");
		WebElement ele1=driver.findElement(By.id("a3"));
		ele1.sendKeys(Keys.CONTROL + "v");
		WebElement ele2=driver.findElement(By.id("a2"));
		ele2.sendKeys(Keys.CONTROL + "a","x");
		WebElement ele3=driver.findElement(By.id("a1"));
		ele3.sendKeys(Keys.CONTROL + "v");
		WebElement ele4=driver.findElement(By.id("a3"));
		ele4.sendKeys(Keys.CONTROL + "a","x");
		WebElement ele5=driver.findElement(By.id("a2"));
		ele5.sendKeys(Keys.CONTROL + "v");
	}
}
