package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			String dbURL = "jdbc:mysql://localhost:3306";
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			System.out.println("MySql 데이터베이스에 성공적으로 접속했습니다.");
			con.close();
		}
		catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다.");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("MySql 데이터베이스 접속에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
