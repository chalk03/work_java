package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Ex05 {

	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306";
			
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("CREATE database world_0;");
			System.out.println("데이터베이스  world_0가 생성되었습니다.");
			con.close();
		}
		catch (Exception e) {
			System.out.println("world_0");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
