package ch07;

public class CalMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		// c.power = true; // 쓸 수 있지만 막아놓았다.
		System.out.println(c.power); // false
		c.setPower();
		System.out.println(c.power); // true
	
		//c.setPower();
		// System.out.println(c.power); // false
		
		
		c.setNum(5);
		String result = c.checkNum();
		
		System.out.println(result);
		System.out.println(c.setRateNum(0.7));
	}
}
