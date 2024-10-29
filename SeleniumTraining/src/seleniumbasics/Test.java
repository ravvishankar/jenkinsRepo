package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		//launch a chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		// maximize the browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//print the title of webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//print the url of webpage
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		/*print the pagesource of url
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);*/
		
		//navigation
		driver.navigate().to("https://www.youtube.in/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
