package dto;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member();
		// 필드값 수정
		// 정보은닉으로 사용 x
		// m1.id = "zoro";
		m1.setId("zoro");
		// m1.age = 22;
		m1.setAge(22);
		// m1.pw = "1234";
		m1.setPw("1234");
		// 캡슐화 메서드(setter)를 사용
		
		
		// 필드값 읽기
		// 정보은닉으로 사용 x
		System.out.println(m1.getId());
		System.out.println(m1.getAge());
		System.out.println(m1.getPw());
		// 캡슐화 메서드(getter)를 사용
	}

}
