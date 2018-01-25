package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DmlEx05 {

	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String DBName = "world_0";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
			String sqlCT = "CREATE table city (" + 
					"id int NOT NULL auto_increment, " + 
					"name varchar(50) NOT NULL," + 
					"major varchar(20) NULL," + 
					"pop int NULL," + 
					"PRIMARY KEY (id) " + ");";

			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			Statement stmt = con.createStatement();
			//stmt.executeUpdate(sqlCT);
			System.out.println("테이블 city가 생성되었습니다.");

			stmt.executeUpdate("insert into city(major, name, pop) values ('서울', '이명길', 20000000);");
			stmt.executeUpdate("insert into city(major, name, pop) values ('인천', '김동훈', 3500000);");
			stmt.executeUpdate("insert into city(major, name, pop) values ('대구', '강수복', 3000000);");
			stmt.executeUpdate("insert into city(major, name, pop) values ('부산', '남기문', 5000000);");
			stmt.executeUpdate("insert into city(major, name, pop) values ('목포', '신용현', 2000000);");
			System.out.println("테이블 city에 5개의 레코드가 삽입되었습니다.");
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("city 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
