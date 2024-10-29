package seleniumbasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prokabaddi.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler banner-close-button ot-close-icon']"))
				.click();
		List<WebElement> team = driver
				.findElements(By.xpath("//div[@class='table-body']//div[@class='table-data team']"));
		System.out.println("Team Size: " + team.size());
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).getText().equalsIgnoreCase("Tamil Thalaivas")) {
				String matches = driver
						.findElement(By.xpath("//div[@class='table-body']//div[@class='table-data matches-play']"))
						.getText();
				String won = driver
						.findElement(By.xpath("//div[@class='table-body']//div[@class='table-data matches-won']"))
						.getText();
				String loss = driver
						.findElement(By.xpath("//div[@class='table-body']//div[@class='table-data matches-lost']"))
						.getText();
				String tie = driver
						.findElement(By.xpath("//div[@class='table-body']//div[@class='table-data matches-draw']"))
						.getText();
				String diff = driver
						.findElement(By.xpath("//div[@class='table-body']//div[@class='table-data score-diff']"))
						.getText();
				System.out.println("Team Name: " + team.get(i).getText());
				System.out.println("Matches: " + matches + " Won: " + won + " Loss: " + loss + " Draw: " + tie
						+ " Score-Diff: " + diff);
			}
		}
		driver.quit();
	}

}
