package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MinMax_Slider {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		Thread.sleep(2000);
		
		WebElement min_btn = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		WebElement max_btn = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		System.out.println(min_btn.getLocation());
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_btn, 100, 0).build().perform();
		System.out.println(min_btn.getLocation());
		Thread.sleep(2000);
		act.dragAndDropBy(max_btn, -100, 0).build().perform();
		System.out.println(max_btn.getLocation());
		Thread.sleep(2000);
		driver.close();

	}

}
