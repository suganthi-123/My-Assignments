package week.day2;

public class browser {
	public void launchbrowser(String browsername) {
		System.out.println("Browser launched successfully");
	}
	public void loadurl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[]args) {
	browser br = new browser();
	br.launchbrowser("chrome");
	br.loadurl();
	}
}
	
	
	


