package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Action {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		WebElement doubleC = driver.findElement(By.id("doubleClickBtn"));
		WebElement RightC = driver.findElement(By.id("rightClickBtn"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doubleC).build().perform();
		Thread.sleep(1500);
		act.contextClick(RightC).build().perform();
		Thread.sleep(1500);
		driver.close();
		
		

	}

}
