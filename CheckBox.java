package assignmentsweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div[@class = 'example']//input)[1]")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class = 'example'][2]//input"));
		if (element.isSelected()) {
			System.out.println("The check box is checked");
		} else {
			System.out.println("The check box is not checked");
		}
		driver.findElement(By.xpath("//div[@class = 'example'][3]/div[2]/input")).click();
		driver.findElement(By.xpath("//div[@class = 'example'][4]/div/input")).click();
		driver.findElement(By.xpath("(//div[@class = 'example'][4]/div/input)[2]")).click();
		driver.findElement(By.xpath("(//div[@class = 'example'][4]/div/input)[3]")).click();
		driver.findElement(By.xpath("(//div[@class = 'example'][4]/div/input)[4]")).click();
		driver.findElement(By.xpath("(//div[@class = 'example'][4]/div/input)[5]")).click();

	}
}
