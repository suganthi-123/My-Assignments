package Week4Assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.time.Duration;



public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver = new ChromeDriver();
	
	 driver.get("https://www.amazon.in/");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
     searchBox.sendKeys("oneplus 9 pro");
     searchBox.submit();



     WebElement priceElement = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
     String price = priceElement.getText();
     System.out.println("Price of the first product: " + price);

   
     WebElement ratingElement = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text a-color-link'])[1]"));
     String ratings = ratingElement.getText();
     System.out.println("Customer ratings of the first product: " + ratings);

     WebElement firstProductLink = driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[1]"));
     firstProductLink.click();

     File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(screenshot, new File("product_screenshot.png"));
     System.out.println("Screenshot of the product taken.");

  
     WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
     addToCartButton.click();

   
     WebElement cartSubtotalElement = driver.findElement(By.id("sc-subtotal-amount-activecart"));
     String cartSubtotal = cartSubtotalElement.getText();
     System.out.println("Cart subtotal: " + cartSubtotal);

     if (cartSubtotal.contains(price)) {
         System.out.println("Cart subtotal is correct.");
     } else {
         System.out.println("Cart subtotal is incorrect.");
     }
     driver.quit();
 }
}