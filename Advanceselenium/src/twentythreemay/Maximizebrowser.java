package twentythreemay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximizebrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.close();
	}
}
