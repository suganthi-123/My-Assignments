package Week5Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ProjectSpcificationMethod {
	 protected WebDriver driver;
	  public void preCondition(String url, String username, String password) {
		  driver = new ChromeDriver();
		  driver.get(url);
		
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("Login")).click();
	    }

	   
	    public void postCondition() {
	        // Close the browser after test completion
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
	  
