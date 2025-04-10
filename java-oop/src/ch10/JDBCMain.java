package ch10;
import java.sql.*;
import java.util.Scanner; // 키보드로부터 입력받는 API
import java.util.ArrayList;

import dto.Actor;


public class JDBCMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// 라이브러리 추가 : 프로젝트 우클릭 -> build-path항목에서 추가
		// 1) 키보드를 통해 매개값 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstName을 입력하세요: ");
		String firstName = scanner.nextLine();
		System.out.println("lastName을 입력하세요: ");
		String lastName = scanner.nextLine();
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		scanner.close();
		
				
		
		// 2) 
		Actor actor = new Actor();
		actor.setFirstName(firstName);
		actor.setLastName(lastName);
		
		// 3) 입력 insert 모듈(메서드) 호출
		ActorDAO actorDao = new ActorDAO();
		int row = actorDao.insertActor(actor);
		
		
		// 4) 조회 SELECT 모듈(메서드) 호출
		ArrayList<Actor> list = actorDao.selectActorList(5);
		
		// 5) 출력
		for(Actor a : list) {
			System.out.println(a.getActorId() + "\t" + a.getFirstName() + "\t" + a.getLastName() + "\t" + a.getLastUpdate());
		}
		
	}

}
