package week3Assignments;

public class Elements extends Button {
public void performAction() {
	click();
	sumbit();
}
	public static void main(String[]args) {
		Elements elements = new Elements();
	elements.performAction();
	
	CheckBoxButton checkbox = new CheckBoxButton();
checkbox.clickCheckButton();
RadioButton radioButton = new RadioButton();
radioButton.selectRadioButton();

TextField textField = new TextField();
textField.setText("Hellow world");
System.out.println("Text in TextField:" + textField.getText());

}
}

