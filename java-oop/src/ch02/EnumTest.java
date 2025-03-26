package ch02;

public class EnumTest {

	public static void main(String[] args) {
		char gender ='M'; // M, F가 아닌 다른 값이 대입될 수 있다.
		
		if(gender== 'M' ) {
			System.out.println("남자");
		} else if(gender == 'F') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 값입니다.");
		}
		
		// Enum 사용시 잘못된 값이 대입될 수 없다.
		Gender gender2 = null; // 참조타입이므로 null 값
		gender2 = Gender.MALE;
		
		if(gender2 == Gender.MALE) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// Enum 사용시 if보다 switch가 가독성이 높을 수도 있다.
		switch(gender2) {
		case Gender.MALE: // 자바에는 +1
			System.out.println("남자");
			break;
		case Gender.FEMALE:
			System.out.println("여자");
			break;				// for문안에 if문안에 break 있으면 if문을 빠져나옴, for문안에 switch문 안에 break 있으면 switch문을 빠져나옴
		}
	}
		
}
