package dd27thmay;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Convertsettolist {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		TreeSet<String> a=new TreeSet<>();
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> op = s.getOptions();
		for(WebElement w:op)
		{
			String text=w.getText();
			a.add(text);
		}
		ArrayList<String> l=new ArrayList<>(a);
		for(String l1:l)
		{
			System.out.println(l1);
		}
		driver.close();
	}
}
