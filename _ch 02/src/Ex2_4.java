
public class Ex2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 리터럴의 접두사와 접미사
		 *  종류		리터럴							접미사
		 * 논리형		false, true						없음
		 * 정수형		123, 0b0101, 077, 0xFF, 100L	L(L이 붙으면 long타입임)
		 * 실수형		3.14, 3.0e8, 1.4f, 0x1.0p-1		f(float), d(double) d는 생략가능
		 * 문자형		'A', '1', '\n'					없음
		 * 문자열		"ABC", "123", "A", "true"		없음 */
		
		/* boolean power = true; or false;
		 * char ch = 'A';
		 * String str = "ABC";
		 * byte b = 127; int 타입(byte는 -128~127까지 저장가능)
		 * byte b = 128; 에러(128은 범위에서 벗어나기 때문)*/
		
		/* int i = 100; 10진수
		 * int oct = 0100; 정수형 리터럴 앞에 0이 붙으면 8진수
		 * int hex = 0x100; 0x가 붙으면 16진수
		 * int b = 0b0101; 0b가 붙으면 2진수
		 * 1e3 -> 1000.0d e는 10의 제곱을 뜻함 */
		
		/* long l = 10_000_000_000L; L생략 불가능
		 * long l = 100; int타입에서도 가능한 범위라 L생략 가능
		 * float f = 3.14f; f생략 불가
		 * double d = 3.14d; d생략 가능 */
		
		/* 변수와 리터럴의 타입 불일치
		 * 1. 범위가 '변수 > 리터럴'인 경우, OK
		 * 		int i = 'A'; -> int > char
		 * 		long l = 123; -> long > int
		 * 		double d = 3.14f; double > float 
		 * 2. 범위가 '변수 < 리터럴'인 경우, 에러
		 * 		int i = 3_000_000_000; -> int의 범위 (±20억) 벗어남
		 * 		long l = 3.14f; -> long < float
		 * 		float f = 3.14; float < double
		 * 3. byte, short 변수에 int리터럴 저장가능(단, 변수의 타입의 범위 이내이어야 함)
		 * 		byte b = 100; -> OK. byte의 범위(-128~127)에 속함
		 * 		byte b = 128; -> 에러. byte의 범위를 벗어남 */
		boolean power = true;
		
		byte b = 127; // -128~127
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로16
		
		long l = 10_000_000_000L;
		
		float f = 3.14f;
		double d = 3.14f; // double이 float보다 범위가 넓기때문에 가능
		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f); //접미사는 출력되지않음
		System.out.println(1e3);
	}

}
