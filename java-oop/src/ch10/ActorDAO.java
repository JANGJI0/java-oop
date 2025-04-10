package ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Actor;

public class ActorDAO {
	// Actor 테이블 데이터를 조회 - select  // hash map으로 반환, dto로 반환
	public ArrayList<Actor> selectActorList(int num) throws ClassNotFoundException, SQLException {
		ArrayList<Actor> list = new ArrayList<Actor>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT actor_id actorId, first_name firstName, last_name lastName, last_update lastUpdate from actor ORDER BY actor_id DESC LIMIT 5";
		stmt = conn.prepareStatement(sql);
		stmt.setInt(1, num);
		rs = stmt.executeQuery();
		// RestSet(특수한: 외부 API) -> ArrayList(일반적: 기본API, 문법)
		while(rs.next()) {
			Actor a = new Actor();
			a.setActorId(rs.getInt("actorId"));
			a.setFirstName(rs.getString("firstName"));
			a.setFirstName(rs.getString("lastName"));
			a.setFirstName(rs.getString("lastUpdate"));
		}
		
		
		conn.close();
		return list;
	}
	
	
	// Actor 테이블 데이터를 입력 - insert
	public int insertActor(Actor actor) throws ClassNotFoundException, SQLException {
		int row = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");  // try catch
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "INSERT INTO actor(first_name, last_name) values (?, ?)";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "java1234");
		
		// 쿼리 실행
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, actor.getFirstName());
		stmt.setString(2, actor.getLastName());
		System.out.println(stmt);
		row = stmt.executeUpdate();
		conn.close();
		return row;
	}
	
	
}
