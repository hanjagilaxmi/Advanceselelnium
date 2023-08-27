package multidd6thjune;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Primedd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/multidd.html");
		WebElement ele = driver.findElement(By.id("Dropdown"));
		Select s=new Select(ele);
		for(int  i=1;i<=10;i++)
		{
			
			s.selectByIndex(i);
			Thread.sleep(2000);
			int no=i;
			int count=0;
		
		for(int j=1;j<=no;j++)
		{
			if(no%j==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				Thread.sleep(2000);
				s.deselectByIndex(no);
			}
			else
			{
				System.out.println(no);
			}
			
		}		
		driver.close();
	}
}
