package week3Assignments;

public abstract class MySqlConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connecting to My Sql Database.........");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disonnecting from  My Sql Database.........");
		
	}

	
	public abstract void executeQuery(String querry);
	
		
		
	}


