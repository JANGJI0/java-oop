package ablock;

public class Person {
	// 정보은닉
	private void first() { // private 생략할 수 있다.
		System.out.println("backup");
	}
	
	// 정보은닉
	 private void second() {  // private 생략할 수 있다.
		System.out.println("delete");
	}
	
	// 캡슐화
	public void deleteMember() {
		this.first();
		this.second();
	}
}
