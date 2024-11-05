package week3Assignments;

public class javaConnect extends MySqlConnection {

	@Override
	public void executeUpdate(String query) {
		System.out.println("Executing update:"+query);
		
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Executing query:"+query);
		
	}

}
