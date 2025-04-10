package ch11;

public class D extends C{ // 1) extends A -> 2) extends C
	public int k;
	// A + C
	public D() {
		super(); // 부모생성자 호출 C() -> A()
		this.k = 0;
		// 그 이후 this 호출
		
		// A() : super.super.x, super.super.name, super.super.m1()
		// C() : super.z, super.m3
		// D() : this.k
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.x = 1; // this.x 없다 -> super.x 없다 -> super.super.x 있다.
		d.z = 2; // this.z 없다 -> super.z 있다.
		d.k = 3; // this.k 있다
	}
}
