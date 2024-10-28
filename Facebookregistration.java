package Week2Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookregistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement createNewButton = driver.findElement(By.xpath("//a[@href='/r.php']"));
		createNewButton.click();
		driver.findElement(By.name("firstname")).sendKeys("Suganthi");
		driver.findElement(By.name("lastname")).sendKeys("Ravikumar");
		driver.findElement(By.name("reg_email__")).sendKeys("7395949253");
		driver.findElement(By.id("password_step_input")).sendKeys("suganthi@96");
		WebElement dateDOB = driver.findElement(By.id("day"));
		Select dateOB = new Select(dateDOB);
		dateOB.selectByValue("31");
		WebElement monthDOB = driver.findElement(By.id("month"));
		Select monthOB = new Select(monthDOB);
		monthOB.selectByValue("1");
		WebElement yearDOB = driver.findElement(By.id("year"));
		Select yearOB = new Select(yearDOB);
		yearOB.selectByValue("1996");
		driver.findElement(By.id("sex")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		WebElement signupButton = driver.findElement(By.name("websubmit"));
        signupButton.click();

	}

}
	