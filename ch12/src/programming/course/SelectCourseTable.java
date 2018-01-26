package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectCourseTable {

	public static void main(String[] args) {
		try {
			String driverName = "org.gjt.mm.mysql.Driver";
			String DBName = "univ";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
			String SQL = "SELECT * FROM course";

			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			Statement stmt = con.createStatement();

			ResultSet result = stmt.executeQuery(SQL);
			System.out.println("---- 테이블 course 내용 조회 ----");
			while (result.next()) {
				System.out.print(result.getInt(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getString(3) + "\t");
				System.out.println(result.getInt(4) + "\t");
			}
			con.close();
		} catch (Exception e) {
			System.out.println("univ 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
