package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateCourseTable {

	public static void main(String[] args) {
		try {
			String DBName = "univ";
			String url = "jdbc:mysql://localhost:3306/" + DBName;
			String sqlCT = "create table course (" + 
					"id int NOT NULL, " + 
					"name varchar(30) NOT NULL,"+ 
					"professor varchar(30) NOT NULL," + 
					"maxnum int NOT NULL," +
					"PRIMARY KEY (id) " + 
					");";
			// 1. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. 데이터베이스 연결
			Connection con = DriverManager.getConnection(url, "root", "koitt");

			// 3. SQL문 작성
			StringBuilder sql = new StringBuilder();
			sql.append(b)
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
