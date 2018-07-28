package javaMysql;
import java.sql.*;

public class dbConn {

	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://localhost:3306/world";
		String username = "root";
		String password = "root";
		try(Connection conn = DriverManager.getConnection(dbUrl, username, password)) {
			System.out.println("Connected to the database");
			
			// MySql insert statement
			String query = "insert into city(ID, Name, CountryCode, District, Population) values (?, ?, ?, ?, ?)";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, 1);
			statement.setString(2, "Chennai");
			statement.setString(3, "IND");
			statement.setString(4, "Tamil Nadu");
			statement.setInt(5, 17809000);
			// execute the statement
			System.out.println("\nInserting into the table.................");
			statement.execute();
			System.out.println("\nInserted...................");
			conn.close();
		}
		catch (SQLException e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

