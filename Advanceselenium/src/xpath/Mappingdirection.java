package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mappingdirection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps/@12.9073152,77.6339456,12z");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Rajajinagr Metro Station");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']")).sendKeys("Vijanagar Metro Station");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'directions-searchbox-1\']/button")).click();
	}
}
