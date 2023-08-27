package Screenshot2ndjune;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSoffacebook {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot st=(TakesScreenshot)driver;
		File src=st.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\deepa\\OneDrive\\Desktop\\QSP\\Facebook\\pop.jpeg");
		FileHandler.copy(src, dst);
		driver.close();
	}
	
}
