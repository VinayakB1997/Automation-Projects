package ScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shtos {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(2000);
		
		TakesScreenshot TS = (TakesScreenshot)driver;
		File SourceFile = TS.getScreenshotAs(OutputType.FILE);
		File TargetFile = new File(System.getProperty("user.dir")+"\\ScreensShtos\\2ndpage.png");
		SourceFile.renameTo(TargetFile);
		Thread.sleep(2000);
		driver.close();
		

	}

}
