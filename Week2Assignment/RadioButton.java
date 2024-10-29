package Week2Assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	  public static void main(String[] args) {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.leafground.com/radio.xhtml");
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement favoriteBrowser = driver.findElement(By.xpath("//input[@value='Your most favourite browser']"));
	            favoriteBrowser.click();
	            favoriteBrowser.click();
	            boolean isSelected = favoriteBrowser.isSelected();
				System.out.println("Is the radio button selected after second click? " + isSelected);
	            WebElement defaultSelected = driver.findElement(By.xpath("//input[@name='favorite' and @checked]"));
	            System.out.println("Default selected radio button value: " + defaultSelected.getAttribute("value"));
	            WebElement ageGroup = driver.findElement(By.xpath("//input[@value='21-40 Years']"));
	            if (!ageGroup.isSelected()) {
	                ageGroup.click();
	                System.out.println("Age group '21-40 Years' selected.");
	            } else {
	                System.out.println("Age group '21-40 Years' was already selected.");
	            }
	  }}