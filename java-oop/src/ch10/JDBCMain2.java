package ch10;
import java.sql.*;
import java.util.Scanner; // 키보드로부터 입력받는 API


public class JDBCMain2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// 라이브러리 추가 : 프로젝트 우클릭 -> build-path항목에서 추가
		Class.forName("com.mysql.cj.jdbc.Driver");  // try catch
		Connection conn = null;
		PreparedStatement stmt = null;
		int row = 0;
		String sql = "INSERT INTO actor(first_name, last_name) values (?, ?)";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "java1234");
			// 디버깅
		// 키보드를 통해 매개값 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstName을 입력하세요: ");
		String firstName = scanner.nextLine();
		System.out.println("lastName을 입력하세요: ");
		String lastName = scanner.nextLine();
		scanner.close();
		
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, firstName);
		stmt.setString(2, lastName);
		System.out.println(stmt);
		
		row = stmt.executeUpdate();
		if(row == 1) {
			System.out.println("입력성공");
		}
		
		// 조회 SELECT
		PreparedStatement stmt2 = null;
		ResultSet rs2 = null;
		String sql2 = "SELECT actor_id actorId, first_name firstName, last_name lastName, last_update lastUpdate from actor ORDER BY actor_id DESC LIMIT 5";
		stmt2 = conn.prepareStatement(sql2);
		rs2 = stmt2.executeQuery();
		System.out.println("actorId\tfirstName\tlastName\tlast_update");
		while(rs2.next()) {
			System.out.println(rs2.getInt("actorId") + "\t" + rs2.getString("firstName") + "\t" + rs2.getString("lastName") + "\t"+ rs2.getString("lastUpdate"));
		}
		
		
		conn.close();
	}

}
