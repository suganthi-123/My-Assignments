package Week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Editlead {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("DemoCsr");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
	loginButton.click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganthi");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravikumar");
	Select stateSelect = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
    stateSelect.selectByVisibleText("New York");
    driver.findElement(By.className("smallSubmit")).click();
    driver.findElement(By.linkText("Edit")).click();
    WebElement descriptionField = driver.findElement(By.name("description"));
    descriptionField.clear();
    driver.findElement(By.name("importantNote")).sendKeys("This is an important note.");
    driver.findElement(By.className("smallSubmit")).click();
    String title = driver.getTitle();
    System.out.println("Title of the page: " + title);
}
}

