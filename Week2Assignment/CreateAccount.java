package Week2Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoCsr");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Suganthi");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industryCS = new Select(industry);
		industryCS.selectByIndex(3);
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipSCO = new Select(ownership);
		ownershipSCO.selectByValue("OWN_SCORP");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourceEMP = new Select(source);
		sourceEMP.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select marketingEC= new Select(marketingCampaign);
		marketingEC.selectByIndex(7);
		WebElement stateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select statePR = new Select(stateProvince);
		statePR.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}

}
}
