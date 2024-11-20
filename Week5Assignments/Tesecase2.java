package Week5Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Tesecase2 {
	public class TestCase2 extends ProjectSpcificationMethod {
		
		@Test
	    public void testIncompleteLegalEntity() {
	        
	        preCondition("https://login.salesforce.com", "dilip@testleaf.com", "leaf@2024");

	        
	        driver.findElement(By.cssSelector("button.slds-button")).click();

	       
	        driver.findElement(By.xpath("//button[text()='View All']")).click();
	        driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();

	        
	        driver.findElement(By.xpath("//div[@class='slds-dropdown-trigger slds-dropdown-trigger_click']")).click();

	        
	        driver.findElement(By.xpath("//span[text()='New Legal Entity']")).click();

	       
	        driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("TestLeaf");

	        
	        driver.findElement(By.xpath("//textarea[@name='Description']")).sendKeys("Salesforces");

	        
	        driver.findElement(By.xpath("//span[text()='Active']")).click();

	        
	        driver.findElement(By.xpath("//button[@name='Save']")).click();

	       
	        WebElement nameFieldError = driver.findElement(By.xpath("//div[contains(text(), 'Complete this field')]"));
	        Assert.assertTrue(nameFieldError.isDisplayed(), "Alert message 'Complete this field' is not displayed.");

	      
	        postCondition();
	    }
	}     }   

