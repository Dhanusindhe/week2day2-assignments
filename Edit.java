package assignmentsweek2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@value = 'Append ']")).sendKeys("abcd");
		String attribute = driver.findElement(By.xpath("//input[@value = 'TestLeaf']")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.xpath("//input[@value = 'Clear me!!']")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
	}
}
