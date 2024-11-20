package Week4Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import java.time.Duration;
public class Frame {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
	  alert.dismiss();
	  driver.switchTo().defaultContent();
	  String resultText = driver.findElement(By.id("demo")).getText();
	  if (resultText.equals("You pressed OK!")) {
          System.out.println("Test Passed: OK button was clicked.");
      } else {
          System.out.println("Test Failed: Unexpected result text.");
      }
	}
}