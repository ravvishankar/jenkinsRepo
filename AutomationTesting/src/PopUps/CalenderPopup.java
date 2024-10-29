package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Date & Time Picker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Date Picker']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder=\"Select A Date\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-current=\"date\"]")).click();
		Thread.sleep(2000);
		

}
}
