package seleniumbasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/odi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement cookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		Actions action = new Actions(driver);
		action.click(cookies);
		List<WebElement> teams = driver
				.findElements(By.xpath("//div[@class='si-table-body']//h3[@class='si-team-name']"));
		List<WebElement> position = driver
				.findElements(By.xpath("//div[@class='si-table-body']//div[@class='si-table-data si-pos']"));
		for (int i = 0; i < teams.size(); i++) {
			if (teams.get(i).getText().equalsIgnoreCase("New Zealand")) {
				System.out.println(teams.get(i).getText() + " : " + position.get(i).getText());
			}
		}

	}
}
