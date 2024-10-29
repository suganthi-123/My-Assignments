package Week2Assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Leafgroundbutton {


public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));;
    driver.get("https://leafground.com/button.xhtml");

   
    WebElement clickAndConfirmButton = driver.findElement(By.xpath("//button[contains(text(),'Click and Confirm title.')]"));
    clickAndConfirmButton.click();

   
    String pageTitle = driver.getTitle();
    if (pageTitle.equals("Dashboard")) {
        System.out.println("Page title is correct: " + pageTitle);
    } else {
        System.out.println("Page title is incorrect: " + pageTitle);
    }

    
    WebElement confirmDisabledButton = driver.findElement(By.xpath("//button[contains(text(),'Confirm if the button is disabled')]"));
    boolean isDisabled = !confirmDisabledButton.isEnabled();
    System.out.println("Confirm button is disabled: " + isDisabled);

   
    WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
    int xPosition = submitButton.getLocation().getX();
    int yPosition = submitButton.getLocation().getY();
    System.out.println("Position of Submit button: (" + xPosition + ", " + yPosition + ")");

   
    WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Find the Save button color')]"));
    String backgroundColor = saveButton.getCssValue("background-color");
    System.out.println("Background color of Save button: " + backgroundColor);

   
    int buttonHeight = saveButton.getSize().getHeight();
    int buttonWidth = saveButton.getSize().getWidth();
    System.out.println("Height of Save button: " + buttonHeight);
    System.out.println("Width of Save button: " + buttonWidth);

    
    driver.quit();
}
}