package assignmentsweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//a[@role = 'button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Dhanwanth");
		driver.findElement(By.name("lastname")).sendKeys("Y");
		driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Ta3762kjdi");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("24");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jun");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1999");
		driver.findElement(By.xpath("//input[@value='2']")).click();

	}
}
