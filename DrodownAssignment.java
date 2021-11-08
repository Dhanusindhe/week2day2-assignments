package assignmentsweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrodownAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement findElement1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select dropdown1 = new Select(findElement1);
		dropdown1.selectByIndex(1);
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select dropdown2 = new Select(findElement2);
		dropdown2.selectByVisibleText("Selenium");
		WebElement findElement3 = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select dropdown3 = new Select(findElement3);
		dropdown3.selectByValue("1");
		WebElement findElement4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select dropdown4 = new Select(findElement4);
		int size = dropdown4.getOptions().size();
		System.out.println(size);

		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("Selenium");
		driver.findElement(By.xpath("//div[@class='example'][6]//option[2]")).click();
		driver.findElement(By.xpath("//div[@class='example'][6]//option[3]")).click();
		driver.findElement(By.xpath("//div[@class='example'][6]//option[4]")).click();
		driver.findElement(By.xpath("//div[@class='example'][6]//option[5]")).click();
	}

}