package assignmentsweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		System.out.println("The position is " + location);
		String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(cssValue);
		Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		System.out.println("The size is " + size);
		driver.findElement(By.xpath("//button[@id='home']")).click();

	}

}
