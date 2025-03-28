package ch05;

public class ClassMember {
		// 1. static : ClassMember 무관하고 공간과 이름만을 빌려 쓴다.
		// 1-1) static method -- 클래스를 빌려쓰면서 쓸 수 있다. 다른언어랑 조금씩 차이가 있을 수 있다.
		public static void sFun() {
			System.out.println("sFun()");
		}
		
		// 1-2) static field
		public static int x = 1;
		
		 public static int[] arr = new int[3];
		

/* public static int[] arr = null; // 자바는 오른쪽에 문법이 올 수 없다. 꼭 대입연산자 식만 와야한다.
										// 이 값은 처음부터 정해져 있어야한다.
		// 1-3) static block
		static { //main 실행될때 static 도 같이 실행 된다.
			ClassMember.arr = new int[3]; // classMember 를 this 로 할 수도 있고 생략할 수도 있다.
			for(int i=0; i<ClassMember.arr.length; i++) {
				int rNum = (int)(Math.random() + 10) + 1;
				ClassMember.arr[i] = rNum;
			} */

		// 2. 생성자
		// public ClassMember() {
			
		
		
		// 3. 메서드
		public void fun() {
			System.out.println("fun()");
		}
		// ClassMember cm = new ClassMember(); cm.fun();											
		
		// 4. 필드
		public String name;
		// 5. 생성자
		public ClassMember() { // 없으면 기본형태로 자동으로 생성됨(컴파일러)
			// 필드 초기화 코드가 없다면 자동으로 코드가 구현됨(컴파일러)
			this.name = null;
		}
		public class InClass{} // 내부클래스(특별한 문법, 잘 쓰진 않는다)
		public enum InEnum { // 내부 Enum
			x, y
		}
		public interface InInterface{} // 내부 인터페이스
		public @interface InAnnotation{} // 내부 애노테이션
	}








