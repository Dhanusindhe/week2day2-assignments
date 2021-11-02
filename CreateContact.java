package assignmentsweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Dhanwanth");
		driver.findElement(By.id("lastNameField")).sendKeys("Y");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("abcd");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("ghg");
		driver.findElement(By.name("departmentName")).sendKeys("mech");
		driver.findElement(By.name("description")).sendKeys("This is the project");
		driver.findElement(By.name("primaryEmail")).sendKeys("acbd@gmail.com");
		WebElement findElement = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropdown = new Select(findElement);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Im gonna rock");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
