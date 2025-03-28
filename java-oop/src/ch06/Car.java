package ch06;
import java.util.ArrayList;
public class Car {
	public int num;
	public boolean is;
	
	// 생성자 오버로딩
	public Car() {}
	public Car(int num, boolean is) {
		this.num = num;
		this.is = is;  // static 안에 this 를 쓸 수 없다.
	}
}
	/*
	public String str;
	public ArrayList<String> list;
	
	// 생성자
	/*public Car() {
		this.num = 1;
		this.is = true;
		this.arr = "test";
		this.list = new ArrayList<String>(); */
		
	// 생성자가 없으면 컴파일러 기계어로 변경할 때
	// 기본생성자 모양으로 자동으로 추가
		/*
		public Car() {
			// 필드 초기화 코드도 자동으로 추가
			// 필드는 초기화의 규칙이 필요
			this.num = 0;
			this.is = false;
			this.str = null;
			this.list = null;
		}
		
		// 일반 생성자
	public Car(int num) {
		// 컴파일러가 일반생성자가 존재하므로 기본생성자를 추가 x
		// 생성자 안에 필드초기화 코드가 없다 -> 추가
		this.num = num;  // 변수 num 있어야하는데 없다.

		/* public Car(int num) {
			// 컴파일러가 일반생성자가 존재하므로 기본생성자를 추가 x
			// 생성자 안에 필드초기화 코드가 없다 -> 추가
			this.num = num;
		*/
		/*
	}
	public Car(boolean is) {
		this.is = is;  // 
	}
	public Car(int num, boolean is) {
		this.num = num;  // 
		this.is = is;  // 
	}
	
	//메서드 오버로딩
	public void test() {}
	public void test(int x) {}
	
}
		 */
	









