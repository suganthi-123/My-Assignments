package week3Assignments;

public class JavaConnection implements DatabaseConnection {
	private boolean isConnected;
	@Override
	public void connect() {
		isConnected = true;
		System.out.println("Database connected");
		
	}

	@Override
	public void disconnect() {
		isConnected = false;
		System.out.println("Database connected");
		
		
	}

	@Override
	public void executeUpdate(String querry) {
		if (isConnected) {
			System.out.println("Executing update:"+querry);
			
		}
		else {
			System.out.println("Cannot execute query . No connection established.");
		}
	}
	

}
