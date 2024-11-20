package Week5Assignments;
import org.testng.annotations.DataProvider;
public class TestData {
	@DataProvider(name = "legalEntityData")
    public Object[][] provideData() {
        return new Object[][]{
            {"Suganthi"}, 
            {"Selvi"}
        };
    }
}

