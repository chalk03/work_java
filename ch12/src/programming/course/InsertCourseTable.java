package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertCourseTable {

	public static void main(String[] args) {
		try {
			String DBName = "univ";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
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
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 3. SQL문 작성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO course Values(?, ?, ?, ?)");
			
			// 4. SQL 실행을 위한 객체 생성
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			// 5. 데이터 입력
			pstmt.executeUpdate("insert into course values ('01', '영어 회화', '권해동', '200');");
			pstmt.executeUpdate("insert into course values ('02', '국어의 이해', '신용현', '120');");
			pstmt.executeUpdate("insert into course values ('03', '한국 근대사', '전성욱', '80');");
			pstmt.executeUpdate("insert into course values ('04', '대화의 기법', '김희천', '60');");
			pstmt.executeUpdate("insert into course values ('05', '컴퓨터 개론', '권순락', '40');");
			System.out.println("테이블 department에 5개의 레코드가 삽입되었습니다.");

			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("univ 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
