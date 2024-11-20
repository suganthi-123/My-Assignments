package Week4Assignment;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class Snapdeal {
	public static void main(String[]args) throws InterruptedException, IOException {
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.snapdeal.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
driver.findElement(By.linkText("Men's Fashion")).click();


driver.findElement(By.linkText("Sports Shoes")).click();


List<WebElement> sportsShoes = driver.findElements(By.xpath("//div[contains(@class, 'product-tuple-listing')]"));
System.out.println("Number of sports shoes: " + sportsShoes.size());

      
driver.findElement(By.linkText("Training Shoes")).click();

       
Select sortDropdown = new Select(driver.findElement(By.id("sort-dropdown")));
sortDropdown.selectByVisibleText("Price Low To High");

        
WebElement minPrice = driver.findElement(By.xpath("//input[@name='minPrice']"));
WebElement maxPrice = driver.findElement(By.xpath("//input[@name='maxPrice']"));
minPrice.clear();
minPrice.sendKeys("500");
maxPrice.clear();
maxPrice.sendKeys("700");
driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();

 
WebElement colorFilter = driver.findElement(By.xpath("//label[contains(@for, 'Color')]"));
colorFilter.click();

        
       
WebElement firstShoe = driver.findElement(By.xpath("(//div[contains(@class, 'product-tuple-listing')])[1]"));
Actions actions = new Actions(driver);
actions.moveToElement(firstShoe).perform();

       
WebElement quickViewButton = driver.findElement(By.xpath("(//button[contains(text(),'Quick View')])[1]"));
quickViewButton.click();

       
WebElement priceElement = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
WebElement discountElement = driver.findElement(By.xpath("//span[contains(@class, 'percent-desc')]"));
String price = priceElement.getText();
String discount = discountElement.getText();
System.out.println("Price: " + price);
System.out.println("Discount: " + discount);

File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
File destination = new File("screenshot.png");
FileUtils.copyFile(screenshot, destination);
System.out.println("Snapshot saved as screenshot.png");

  
driver.close();

        // Step 16: Close the main window
driver.quit(); // Closes the main window and quits the WebDriver session
    }
}
	
	


