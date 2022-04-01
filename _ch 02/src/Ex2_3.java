
public class Ex2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 변수의 타입
		 * int age = 25; int는 정수타입
		 * age = 3.14; 3.14는 실수이기 때문에 에러가 남 */
		
		/* 저장할 값의 타입과 일치하는 타입으로 변수를 선언
		 * char ch = '가'; char는 문자 타입
		 * double pi = 3.14; double은 실수 타입 */
		
		/* 값의 타입
		 * 값에는 문자와 숫자가 있음 
		 * 문자는 '가'"나" - char
		 * 숫자는 정수 - byte, short, int, long
		 * 		실수 - float, double
		 * 		논리 - boolean (true, false) */
		
		/* 변수, 상수, 리터럴
		 * 변수(variable) - 하나의 값을 저장하기 위한 공간
		 * 상수(constant) - 한 번만 값을 저장 가능한 변수
		 * 리터럴(literal) - 그 자체로 값을 의미하는 것(숫자나 문자 그 자체)
		 * int score = 100;
		 * 		score = 200;
		 * 결과 score = 200이 됨
		 * final int MAX = 100; MAX는 상수가 됨
		 * 			 MAX = 200; 에러가 뜸 
		 * 결과  MAX = 100이 됨
		 * char ch = 'A';
		 * Sting str = "abc"; */
		/* final */ int score = 100;
		 score = 200; 
		
		System.out.println(score); // 200
	}

}
