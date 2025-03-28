package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement PC = driver.findElement(By.linkText("COMPUTERS"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(PC).build().perform();
		Thread.sleep(2000);
		driver.close();
		

	}

}
