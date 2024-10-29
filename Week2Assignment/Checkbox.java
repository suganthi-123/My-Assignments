package Week2Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {


	    public static void main(String[] args) {
	        
	    	ChromeDriver driver = new ChromeDriver();
			driver.get("https://leafground.com/checkbox.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			 WebElement basicCheckbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		        basicCheckbox.click();
		        WebElement notificationCheckbox = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		        notificationCheckbox.click();
		        WebElement notificationMessage = driver.findElement(By.id("notificationMessageId")); // Update with actual ID
		        if (notificationMessage.isDisplayed()) {
		            System.out.println("Notification message is displayed.");
		        }
		        WebElement favoriteLanguageCheckbox = driver.findElement(By.xpath("//input[@value='YourFavoriteLanguage']")); // 
		        favoriteLanguageCheckbox.click();
		        WebElement triStateCheckbox = driver.findElement(By.id("triStateCheckboxId")); 
		        triStateCheckbox.click();
		        String triStateStatus = triStateCheckbox.getAttribute("value");
		        System.out.println("Tri-state option selected: " + triStateStatus);
		        WebElement toggleSwitch = driver.findElement(By.id("toggleSwitchId")); 
		        toggleSwitch.click();
		        WebElement toggleMessage = driver.findElement(By.id("toggleMessageId"));
		        if (toggleMessage.isDisplayed()) {
		            System.out.println("Toggle switch message is displayed.");
		        }
		        WebElement disabledCheckbox = driver.findElement(By.id("disabledCheckboxId"));
		        boolean isDisabled = !disabledCheckbox.isEnabled();
		        System.out.println("Checkbox is disabled: " + isDisabled);
		        WebElement option1 = driver.findElement(By.xpath("//input[@value='Option1']"));
		        WebElement option2 = driver.findElement(By.xpath("//input[@value='Option2']"));
		        option1.click();
		        option2.click();
		       
		        driver.quit();
		    }
		}
