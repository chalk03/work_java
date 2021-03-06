package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDeptTable {

	public static void main(String[] args) {
		try {
			String driverName = "org.gjt.mm.mysql.Driver";
			String DBName = "univ";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
			String SQL = "SELECT * FROM department";

			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(SQL);
			
			while (result.next()) {
				System.out.printf("%2d " , result.getInt(1));
				System.out.printf("%6s " , result.getString(2));
				System.out.printf("%8d " ,result.getInt(3));
				System.out.println();
			}
			con.close();
		} catch (Exception e) {
			System.out.println("univ 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
