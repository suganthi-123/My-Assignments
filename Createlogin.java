package Week2Assignment;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Createlogin {
public static void main(String[]args) {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement usernameField = driver.findElement(By.id("username"));
usernameField.sendKeys("democsr");
WebElement passwordField = driver.findElement(By.name("PASSWORD"));
passwordField.sendKeys("crmsfa");
WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
loginButton.click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("Suganthi");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.id("numberEmployees")).sendKeys("5");
driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
driver.findElement(By.className("smallSubmit")).click();
String title= driver.getTitle();
System.out.println(title);

}

}