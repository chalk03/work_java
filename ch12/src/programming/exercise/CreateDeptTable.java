package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDeptTable {

	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String DBName = "univ";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
			String sqlCT = "create table department (" + 
					"id int NOT NULL, " + 
					"name varchar(30) NOT NULL,"+ 
					"numstudent int NOT NULL," + 
					"PRIMARY KEY (id) " + 
					");";

			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			Statement stmt = con.createStatement();
			stmt.executeUpdate(sqlCT);
			System.out.println("테이블 department가 생성되었습니다.");

			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("univ 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
