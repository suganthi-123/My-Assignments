package Week5Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesforceAutomationtest {
	WebDriver driver;

    
    @BeforeMethod
    public void setUp() {
        // Set the path for the ChromeDriver (update as per your system)
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "legalEntityData", dataProviderClass = TestData.class)
    public void createLegalEntityTest(String name) throws InterruptedException {
        // Navigate to Salesforce login page
        driver.get("https://login.salesforce.com");

        
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("Login"));
        
        username.sendKeys("your_username");
        password.sendKeys("your_password");
        loginButton.click();

        
        Thread.sleep(5000); // Ideally use WebDriverWait here.

       
        WebElement toggleMenu = driver.findElement(By.cssSelector("button.slds-button"));
        toggleMenu.click();

        
        WebElement viewAllButton = driver.findElement(By.xpath("//span[text()='View All']"));
        viewAllButton.click();
        
        WebElement legalEntitiesTab = driver.findElement(By.xpath("//span[text()='Legal Entities']"));
        legalEntitiesTab.click();

        
        WebElement dropdownIcon = driver.findElement(By.cssSelector("button.dropdown-icon"));
        dropdownIcon.click();

        WebElement newLegalEntityButton = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
        newLegalEntityButton.click();

        
        WebElement nameField = driver.findElement(By.id("legalEntityName"));
        nameField.sendKeys("Salesforce Automation by " + name);

        
        WebElement saveButton = driver.findElement(By.cssSelector("button.save"));
        saveButton.click();

        
        Thread.sleep(3000);

        
        WebElement entityNameLabel = driver.findElement(By.cssSelector("h1.entity-name"));
        String actualEntityName = entityNameLabel.getText();

        
        Assert.assertEquals(actualEntityName, "Salesforce Automation by " + name);

        
        driver.quit();
    }
}

