
public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 변수의 선언 - 값(data)을 저장할 공간을 마련하기 위함 
		 * 선언 방법 = 변수타입 변수이름; 
		 * 			int age; 정수(int)타입의 변수 age를 선언 */
		
		/* 변수에 값 저장하기 ('='은 등호가 아닌 대입임)
		 * int age; 정수(int)타입의 변수 age를 선언
		 * age = 25; 변수 age에 25를 저장
		 * int age = 25; 위의 두 줄을 한 줄로 */
		
		/* 변수의 초기화 - 변수에 처음으로 값을 저장하는 것
		 * int x = 0; 변수 x를 선언 후, 0으로 초기화
		 * int y = 5; 변수 y를 선언 후, 5로 초기화
		 * int x = 0, y = 5; 위의 두 줄을 한 줄로 */
		
		/* 변수의 값 읽어오기
		 * int year = 0, age = 14;
		 * year = age + 2000;
		 * -> year = 14 + 2000;
		 * -> year = 2014;
		 * age = age + 1;
		 * age = 14 + 1;
		 * age = 15;
		 * System.out.println(age);
		 * -> System.out.printlm(15) 15가 출력됨 */
		int x = 4,y = 2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
	}

}
