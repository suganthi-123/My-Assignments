package Week4Assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.time.Duration;

public class Webtable {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://finance.yahoo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement cryptoTab = driver.findElement(By.linkText("Crypto"));
 cryptoTab.click();
 Thread.sleep(2000);
 WebElement table = driver.findElement(By.xpath("//table"));
 List<WebElement> rows = table.findElements(By.tagName("tr"));
 for (int i = 1; i < rows.size(); i++) {
     
     List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
     if (columns.size() > 1) { 
         String cryptoName = columns.get(1).getText(); 
         System.out.println(cryptoName);
     }
 }
 driver.quit();
    }
}


