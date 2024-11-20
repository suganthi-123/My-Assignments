package Week4Assignment;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
public class Windowhandling {
	
	public static void main(String[]args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Merge Contacts")).click();
		 driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		  String mainWindowHandle = driver.getWindowHandle();
          Set<String> windowHandles = driver.getWindowHandles();
          for (String handle : windowHandles) {
              if (!handle.equals(mainWindowHandle)) {
                  driver.switchTo().window(handle);
                  driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
                  break;
              }
          }
          driver.switchTo().window(mainWindowHandle);
          driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
          for (String handle : windowHandles) {
              if (!handle.equals(mainWindowHandle)) {
                  driver.switchTo().window(handle);
                  driver.findElement(By.xpath("(//a[@class='linktext'])[2]")).click();
                  break;
              }
          }
          driver.switchTo().window(mainWindowHandle);
          driver.findElement(By.linkText("Merge")).click();
          Alert alert = driver.switchTo().alert();
          alert.accept();
          String pageTitle = driver.getTitle();
          if (pageTitle.equals("View Contact | opentaps CRM")) {
              System.out.println("Title Verified: " + pageTitle);
          } else {
              System.out.println("Title does not match, current title: " + pageTitle);
          }
          
	}
	
}