package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoosend {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("laxmiqsp8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qsp@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='root_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-labelledby='to']")).sendKeys("laxneelamma26@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Leave Remainder");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("This is laxmi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
	}

}
