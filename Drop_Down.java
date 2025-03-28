package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Vinayak");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Bhandari");
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.id("day"));
		Select Date= new Select(date);
		Date.selectByIndex(13);
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select Month = new Select(month);
		Month.selectByVisibleText("Sep");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select Year = new Select(year);
		Year.selectByValue("1997");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("8971956963");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[7]")).sendKeys("Vin8971956963");
		Thread.sleep(2000);
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(10000);
		driver.close();
		
		
		
	}

}
