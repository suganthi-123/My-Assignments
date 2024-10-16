package week.day2;

public class Library {
public String addBook(String bookTitle) {
System.out.println("book added successfully");
return bookTitle;
}
public void issuedBook() {
	System.out.println("book issued sucessfully");
}
public static void main(String[]args) {
	Library lib=new Library();
	lib.addBook("agni siragagul");
	lib.issuedBook();
}
}

