package assignmentsweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		WebElement findElement = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		boolean selected = findElement.isSelected();
		if (selected == true) {
			System.out.println("The element is selected");
		} else {
			System.out.println("The element is not selected");
		}

	}

}
