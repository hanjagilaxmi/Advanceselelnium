package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeMap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Rajajinagr Metro Station");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']")).sendKeys("Vijanagar Metro Station");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[2]/div/div[3]/div[1]/div[2]/div[2]/button[1]")).click();
		//driver.findElement(By.xpath("//button[@jsaction='search' and text()='::before']")).click();
	}
}
