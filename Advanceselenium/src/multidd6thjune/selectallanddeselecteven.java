package multidd6thjune;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectallanddeselecteven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/multidd.html");
		WebElement ele = driver.findElement(By.id("Dropdown"));
		Select s=new Select(ele);
		for(int  i=0;i<10;i++)
		{
			s.selectByIndex(i);
		}
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				s.deselectByIndex(i);
			}
			else
			{
				System.out.println(i);
			}
		}
		driver.close();
	}
}
