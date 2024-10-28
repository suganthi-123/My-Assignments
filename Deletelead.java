package Week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Deletelead {
	public static void main(String[]args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("democsr");
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		passwordField.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.name("phoneNumber")).sendKeys("7395949253");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

       
        WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
        String leadID = firstLead.getText();

       
        firstLead.click();

       
        driver.findElement(By.linkText("Delete")).click();

       
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("id")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        
        String noRecordsMessage = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
        if (noRecordsMessage.equals("No records to display")) {
            System.out.println("Lead deletion verified successfully.");
        } else {
            System.out.println("Lead deletion verification failed.");
        }
    } 
}
 
    


