package ch07;

public class Calculator {
	public Calculator() {
		this.power = false;
	}
	public boolean power;
	public int num;
	
	// this.num * (0.5 ~ 1.5)
	public double setRateNum(double rate) {
		double result = 0;
		if(this.power == false) { // !this.power랑 같다
			System.out.println("계산기가 OFF 상태");
		} else {
			if(!(rate >0.5 && rate <= 1.5)) {
				System.out.println("입력값 ERROR");
			} else {
				result = this.num * rate;
			}
		}
		return result;
	}
	
	public void setPower() {
		this.power = !this.power;
	}
	
	public void setNum(int num) {
		//게산기 파워가 ON(true)일때만 실행
		if(this.power == true) { // this.power로 줄일 수 있다.
		this.num = num; // 두개값 반환할 수있는것 배열로
	} else {
		System.out.println("계산기 OFF 상태");
	}
}
	
	// this.num 이 짝수인지 홀수 인지 알고싶은 메소드
	public String checkNum() {
		// 계산기 파워가 ON(true)일때만 실행
		String result = "";
		if(this.power == false) { // !this.power 로 쓸 수 있다
		if(this.num % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
	} else {
		System.out.println("계산기가 OFF 상태");
		result = "ERROR";
	}
		return result;
	}
}
