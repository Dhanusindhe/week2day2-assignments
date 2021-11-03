package assignmentsweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.name("submitButton")).click();
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if (text.contains(text2)) {
			System.out.println("Duplicated name confiemed");

		} else {
			System.out.println("Duplicated not name confiemed");

		}
	}
}
