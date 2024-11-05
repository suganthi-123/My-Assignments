package week3Assignments;

public interface DatabaseConnection{
	void connect();
	void disconnect();
	void executeUpdate(String querry);
}


