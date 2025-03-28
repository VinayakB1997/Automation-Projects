package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement Google = driver.findElement(By.className("gLFyf"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Google).click().sendKeys("ExcelR").build().perform();
		act.pause(1000);
		act.keyDown(Keys.DOWN).build().perform();
		act.pause(1000);
		act.keyDown(Keys.DOWN).build().perform();
		act.pause(1000);
		act.keyDown(Keys.DOWN).build().perform();
		act.pause(1000);
		act.keyDown(Keys.DOWN).build().perform();
		act.pause(1000);
		act.keyDown(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
