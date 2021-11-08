package assignmentsweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageAssignment {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
		String attribute = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
		driver.navigate().to(attribute);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.xpath("../images/keyboard.png")).click();

	}

}
