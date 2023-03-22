package testjava;
import java.sql.*;

public class name {

	public static void main(String[] args) {		

		try {

		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testjava?user=root&password=cocito2022");
		System.out.println("connessione aperta");
		Statement stmt = connection.createStatement();
		String script="INSERT INTO categoriee (codice,descrizione) VALUES (1,'Prova J connessione')";
		stmt.executeUpdate(script);
		stmt.close();
		connection.close();
		}
		catch(SQLException ex) {
		ex.printStackTrace();

		}
	}
}
