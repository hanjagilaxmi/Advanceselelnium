package twentythreemay;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchlocationofelemet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[@title='Kannada']"));
		Point loc=ele.getLocation();
		System.out.println(loc);
		driver.close();
	}
}
