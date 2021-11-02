package assignmentsweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("UserFirstName")).sendKeys("Dhanwanth");
		driver.findElement(By.name("UserLastName")).sendKeys("Y");
		driver.findElement(By.name("UserEmail")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("123456898");
		driver.findElement(By.name("UserTitle")).sendKeys("123456898");
		WebElement findElement = driver.findElement(By.name("UserTitle"));
		Select dropdown = new Select(findElement);
		dropdown.selectByIndex(1);
		WebElement findElement1 = driver.findElement(By.name("CompanyEmployees"));
		Select dropdown1 = new Select(findElement1);
		dropdown1.selectByIndex(1);
		WebElement findElement2 = driver.findElement(By.name("CompanyCountry"));
		Select dropdown2 = new Select(findElement2);
		dropdown2.selectByValue("IN");
		driver.findElement(By.className("checkbox-ui")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
