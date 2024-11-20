package Week5Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Testcase1 extends ProjectSpcificationMethod {
	@Test
    public void testCreateLegalEntity() {
		preCondition("https://login.salesforce.com/", "dilip@testleaf.com", "leaf@2024");

        
        driver.findElement(By.cssSelector("button.slds-button")).click();

        
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();

        
        driver.findElement(By.xpath("//div[@class='slds-dropdown-trigger slds-dropdown-trigger_click']")).click();

        
        driver.findElement(By.xpath("//span[text()='New Legal Entity']")).click();

        
        WebElement nameField = driver.findElement(By.xpath("//input[@name='Name']"));
        nameField.sendKeys("Salesforce Automation by Suganthi");

        
        driver.findElement(By.xpath("//button[@name='Save']")).click();

        
        WebElement legalEntityName = driver.findElement(By.xpath("//h1[@class='slds-text-heading_large']"));
        Assert.assertEquals(legalEntityName.getText(), "Salesforce Automation by Suganthi");

        
        postCondition();
    }
}