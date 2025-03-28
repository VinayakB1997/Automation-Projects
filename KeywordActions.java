package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com");
		Thread.sleep(2000);
		
		WebElement T1 = driver.findElement(By.id("inputText1"));
		WebElement T2 = driver.findElement(By.id("inputText2"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(T1).click().sendKeys("Yes i got this");
		
		act.pause(1500);
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		act.pause(1000);
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		act.pause(1000);
		
		act.moveToElement(T2).click();
		act.pause(1000);
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.id("compareButton")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
