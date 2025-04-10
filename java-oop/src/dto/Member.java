package dto;

public class Member {
	// 정보은닉
	private String id;
	private int age;
	private String pw;
	
	// 캡슐화
	// 셋터
	public void setId(String id) {
		this.id = id;
	}
	
	// 겟터
	public String getId() {
		return this.id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
