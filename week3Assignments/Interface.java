package week3Assignments;

public class Interface {
public static void main(String[] args) {
	DatabaseConnection dbConnection = new JavaConnection();
	
	dbConnection.connect();
	dbConnection.executeUpdate("Update users SET name = 'Suganthi' Where id=1");
	dbConnection.disconnect();
}
}
