package week3Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import java.util.ArrayList;
import java.util.List;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
	driver. get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(3000);
	 driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
	 
	 
	 String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
	 System.out.println(text);
List<WebElement> elements = driver.findElements(By.xpath("//div[@class='brand']"));

List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='nameCls']"));

for(WebElement web: elements) {
	String text2 =web.getText();
	System.out.println(text2);
}
	List<String>list = new ArrayList<String>();
	for (WebElement each : elements2) {
		String text1 = each.getText();
		list.add(text1);
		
	}
	System.out.println("List Of Bags");
}}