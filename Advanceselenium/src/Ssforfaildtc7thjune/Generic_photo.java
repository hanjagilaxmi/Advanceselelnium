package Ssforfaildtc7thjune;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_photo {
	public static void getPhoto(WebDriver driver) throws IOException
	{
		String photo="./Photos/";
		Date d=new Date();
		String d1=d.toString();
		TakesScreenshot st=(TakesScreenshot)driver;
		File src=st.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d1+".jpeg");
		FileHandler.copy(src,dst);
	}
}
