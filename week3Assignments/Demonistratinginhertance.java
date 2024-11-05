package week3Assignments;

public class Demonistratinginhertance {
public static void main(String[]args) {
	TestData testData = new TestData();
	testData.enterCredentails("suganthiravikumar@gmail.com", "1996");
	testData.navigateToHomePage();
	LoginTestData loginTestData = new LoginTestData();
	loginTestData.enterUsername("suganthiravikumar@gmail.com");
	loginTestData.enterPassword("1996");
}
}
