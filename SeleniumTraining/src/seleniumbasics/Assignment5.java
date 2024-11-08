package seleniumbasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement cookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
		Actions action = new Actions(driver);
		action.click(cookies);
		List<WebElement> country = driver.findElements(
				By.xpath("//div[@class='sc-kiwtDi sc-jftISh cjAeHB ektOhz']//span[@data-cy='country-name']"));
		System.out.println(country.size());
		for (int i=0; i<country.size();i++) {
			//if (country.get(i).getText().equalsIgnoreCase("Australia")) {
			//driver.findElement(by.)
			//}
		}

	}

}
//(//div[@class='sc-kfDwnz sc-bEESjQ Sifob guXOnG']/div)[3]
