package assignmentsweek2day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkAssignment {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		driver.navigate().back();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(attribute);
		WebElement link = driver.findElement(By.linkText("Verify am I broken?"));
		String attribute2 = link.getAttribute("href");
		driver.navigate().to(attribute2);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		String attribute3 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		driver.navigate().to(attribute3);
		driver.navigate().back();
		List<WebElement> link1 = driver.findElements(By.linkText("How many links are available in this page?"));
		int size = link1.size();
		System.out.println(size);

	}
}
