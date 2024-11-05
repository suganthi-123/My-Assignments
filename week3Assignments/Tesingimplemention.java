package week3Assignments;

public class Tesingimplemention {
	public static void main(String[] args) {

javaConnect Connection = new javaConnect();
Connection.connect();
Connection.executeUpdate("UPDATE users SET names ='Suganthi' Where id=1");
Connection.executeQuery("Select + FROM users");
Connection.disconnect();
	}
}

