package Week5Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SalesforceTest {
	WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            // Specify the path of the ChromeDriver
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
        }
        
        driver.manage().window().maximize();
    }

    @Test
    @Parameters({"url", "username", "password", "companyName", "description", "status"})
    public void createNewLegalEntity(String url, String username, String password, String companyName, String description, String status) throws InterruptedException {
        // Step 1: Navigate to Salesforce login page
        driver.get(url);

       
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();

        // Wait for the page to load
        Thread.sleep(5000);

        
        WebElement menuToggle = driver.findElement(By.xpath("//div[contains(@class, 'slds-icon-waffle')]"));
        menuToggle.click();
        WebElement appLauncher = driver.findElement(By.xpath("//button[text()='View All']"));
        appLauncher.click();

        WebElement legalEntities = driver.findElement(By.xpath("//span[text()='Legal Entities']"));
        legalEntities.click();

        
        WebElement dropdown = driver.findElement(By.xpath("//div[@title='Legal Entities']//button"));
        dropdown.click();
        WebElement newLegalEntity = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
        newLegalEntity.click();

        
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(companyName);
        driver.findElement(By.xpath("//textarea[@name='Description']")).sendKeys(description);
        
        driver.findElement(By.xpath("//lightning-combobox[@name='Status']")).sendKeys(status);

        
        driver.findElement(By.xpath("//button[text()='Save']")).click();

        
        WebElement alertMessage = driver.findElement(By.xpath("//div[contains(text(),'Complete this field')]"));
        Assert.assertTrue(alertMessage.isDisplayed(), "Alert message is not displayed!");

      
        Thread.sleep(5000);
        driver.quit();
    }
}