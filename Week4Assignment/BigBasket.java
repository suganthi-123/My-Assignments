package Week4Assignment;	


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BigBasket {

public static void main(String[] args) throws IOException {
ChromeDriver driver = new ChromeDriver();
			
driver.get("https://www.bigbasket.com/");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement shopByCategory = driver.findElement(By.xpath("//span[text()='Shop by Category']"));
shopByCategory.click();

WebElement foodgrainsMenu = driver.findElement(By.xpath("//span[text()='Foodgrains, Oil & Masala']"));

foodgrainsMenu.click(); 


WebElement riceProductsMenu = driver.findElement(By.xpath("//span[text()='Rice & Rice Products']"));
riceProductsMenu.click(); 


WebElement boiledRiceOption = driver.findElement(By.xpath("//a[contains(@href, 'boiled-steam-rice')]"));
boiledRiceOption.click();


WebElement bbRoyalFilter = driver.findElement(By.xpath("//label[contains(text(),'bb Royal')]"));
bbRoyalFilter.click();


WebElement tamilPonniRice = driver.findElement(By.xpath("//a[contains(text(),'Tamil Ponni Boiled Rice')]"));
tamilPonniRice.click();


WebElement fiveKgOption = driver.findElement(By.xpath("//span[contains(text(),'5 kg')]"));
fiveKgOption.click();


WebElement priceElement = driver.findElement(By.xpath("//span[contains(@class, 'price')]"));
String price = priceElement.getText();
System.out.println("Price of Tamil Ponni Boiled Rice (5 kg): " + price);


WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
addToCartButton.click();


WebElement successMessage = driver.findElement(By.xpath("//div[@class='popup-success']"));
if (successMessage.isDisplayed()) {
    System.out.println("Success: Item added to cart.");
} else {
    System.out.println("Failure: Item not added to cart.");
}


File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
File destinationFile = new File("screenshot.png");
ImageIO.write(ImageIO.read(screenshot), "PNG", destinationFile);
System.out.println("Screenshot taken.");


driver.close();


driver.quit();
}}

