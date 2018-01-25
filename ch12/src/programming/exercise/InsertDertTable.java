package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDertTable {

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
			
			stmt.executeUpdate("insert into department values ('01', '경영학과', '120');");
			stmt.executeUpdate("insert into department values ('02', '컴퓨터공학과', '60');");
			stmt.executeUpdate("insert into department values ('03', '기계공학과', '80');");
			stmt.executeUpdate("insert into department values ('04', '전자공학과', '80');");
			stmt.executeUpdate("insert into department values ('05', '국어국문학과', '40');");
			System.out.println("테이블 department에 5개의 레코드가 삽입되었습니다.");

			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("univ 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

