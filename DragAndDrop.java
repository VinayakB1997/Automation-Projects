package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement SK = driver.findElement(By.id("box105"));
		
		Actions At = new Actions(driver); 
		At.dragAndDrop(Seoul, SK).build().perform();
		Thread.sleep(1500);
		driver.close();

	}

}
