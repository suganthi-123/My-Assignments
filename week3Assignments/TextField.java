package week3Assignments;

public class TextField extends WebElement{
private String text;
public void setText(String text) {
	this.text = text;
	super.setText(text);
}
public String getText() {
	return this.text;
}

}