package ch11;
// is(상속관계)
// 객체 지향문법쓸때 상속관계 사용
public class C extends A { // extends: 상속
	public C() {
		super(); // 생략 A
	}
	public int z;
	public void m3() {
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.x = 1;
		c.m1();
		
		c.z = 2;
		c.m3();
		c.name = "goodee";
		
	}
	
}
