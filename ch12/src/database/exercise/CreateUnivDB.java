package database.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateUnivDB {

	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306";
			
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("create database univ;");
			
			System.out.println("데이터베이스 univ가 생성되었습니다.");
			System.out.println("이미 생성되어 있는 데이터베이스 입니다.");
			stmt.close();
			con.close();
		}
		catch (Exception e) {
			System.out.println("univ 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
