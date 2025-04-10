package ch09;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2 {
	// 반환타입 : Map
	// 메개타입 : Student
	public HashMap<String, Object> m9a(Student s) {
		HashMap<String, Object> result 
			= new HashMap<String, Object>();
		result.put("num", s.num);
		result.put("name", s.name);
		return result;
	}
	
	// 반환타입 : List<String>
	// 매개타입 : 임의의 개수의 문자열
	public ArrayList<String> m8a(String ... name) {
		ArrayList<String> result = new ArrayList<String>();
		for(String n : name) {
			result.add(n);
		}
		return result;
	}
	
	
	// 반환타입 : Student[]
	// 매개타입 : List<Map>
	public Student[] m7a(ArrayList<HashMap<String, Object>> list) {
		Student[] arr = new Student[list.size()];
		int i = 0;
		for(HashMap<String, Object> m : list) {
			arr[i] = new Student();
			arr[i].num = (Integer)(m.get("num"));
			arr[i].name = (String)(m.get("name"));
			i=i+1;
		}
		return arr;
	}
	
	// 반환타입 : 클래스
	// 매개타입 : int, String
	public Student m6a(int num, String name) {
		Student s = new Student();
		s.num = num;
		s.name = name;
		return s;
	}
	
	// {과제}
	// 반환타입 : 배열
	// 매개타입 : int
	// 252 -> {2, 5, 2}
	public int[] m5a(int num) { // 나누기 연산
		int[] result = null;
		int count = 0;
		int n = num;
		// 자릿수 구하기
		while(n > 0) {
			n /= 10;	// 10으로 나누며 자리 줄이기
			count++;	// 몇 번 나눴는지 자릿수 세기
		}
		result = new int[count]; // 배열생성
		// 배열에 자릿수 채우기 (뒤에서부터 1의자리 -> 10의자리 -> 100의 자리 순으로 나온다.
		for(int i = count -1; i>=0; i--) {
			result[i] = num % 10;
			num /= 10;
		 }
		return result;
	}
	
	// 252 -> {"2", "5", "2"}
	public String[] m5b(int num) { // substring() 메서드
		String[] result = null;
		String str = num+""; // "252"
		result = new String[str.length()]; // new String[3]
		for(int i=0; i<result.length; i++) {
			if(i != result.length-1) {
				result[i] = str.substring(i, i+1); // (0, 1) (1, 2)
			} else {  // (2)
				result[i] = str.substring(i);
			}
 		}
		return result;
	}
	
	
	// 반환타입 : 배열
	// 매개타입 : List
	// List를 입력받아서 배열로 변경하여 반환
	public int[] m4a(ArrayList<String> list) {
		int[] result = new int[list.size()];
		int i = 0;
		for(String s : list) {
			result[i] = Integer.parseInt(s);
			i=i+1;
		}
		return result;
	}
	
	// 반환타입 : boolean
	// 매개타입 : 클래스 두개
	public boolean m24c(Student s1, Student s2) {
		boolean result = false;
		// s1, s2 를 비교하는 코드
		if(s1.num == s2.num && s1.name.equals(s2.name)) {
			result = true;
		}
		return result;
	}
	
	
	// Student타입을 디버깅한 문자열을 반환하는 메서드
	// 반환타입 : String
	// 매개타입 : 클래스 하나
	public String m25a(Student s) {
		String result = "";
		result += "번호는 "+ s.num + "이고, ";
		result += "이름은 "+ s.name+"입니다.";
		return result; // 번호는 ?이고, 이름은 ? 입니다
	}
	
	// 반환타입 숫자
	// 매개타입 배열 : 배열
	// 배열.length API 금지!
	// 배열을 입력하면 반환값으로 배열의 길이 반환
	public int m24b(int[] arr) {
		int i = 0; // arr.length 사용금지
		boolean flag = true;
		while(flag) { // 무한루프
			try {
				int temp = arr[i];
			} catch(Exception e) {
				return i;
			}
			i++;
		}
		return i;
	}
	
	public int m24a(int[] arr) {  // ex) int x = new int[7]
		int result = 0; // arr.length 사용금지
		for(int i : arr) {
			result++;
		}
		return result;
	}
}
