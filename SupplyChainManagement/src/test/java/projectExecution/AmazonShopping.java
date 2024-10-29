package projectExecution;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShopping {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		driver.findElement(By.xpath("//div[@aria-label='puma shoes for man']")).click();
		List<WebElement> allshoeName = driver.findElements(By.xpath(
				"//span[.='Puma']/ancestor::div[@class='a-row a-size-base a-color-secondary']/following-sibling::h2/a/span"));
		List<WebElement> getPrice = driver.findElements(By.xpath(
				"//span[.='Puma']/ancestor::div[@data-cy='title-recipe']/following-sibling::div[@data-cy='price-recipe']//span[@class='a-price-whole']"));
		for (int i = 0; i < allshoeName.size(); i++) {
			String s = getPrice.get(i).getText().replaceAll(",", "");
			int value = Integer.parseInt(s);
			if (value <= 2000)
				System.out.println(allshoeName.get(i).getText() + " : " + value);
		}
		driver.quit();
	}
}
