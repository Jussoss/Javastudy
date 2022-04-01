
public class Ex2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* println()의 단점 - 츨력형식 지정불가
		 * 1. 실수의 자리수 조절불가 - 소수점 n자리만 출력하려면?
		 * System.out.println(10.0/3); -> 3.333333...
		 * 2. 10진수로만 출력된다. - 8진수, 16진수로 출력하려면?
		 * System.out.println(0x1A); -> 26 */
		
		/* printf()로 출력형식 지정가능
		 * System.out.printf("%.2f", 10.0/3); -> 소수점 두번째 자리까지만 표시한다는 뜻 3.33
		 * System.out.printf("%d", 0x1A); -> %d는 10진수 26 
		 * System.out.printf("%X", 0x1A); -> %X는 16진수 1A*/ 
		System.out.printf("%d%n", 15); // %n은 줄바꿈
		System.out.printf("%#o%n", 15); // #은 접두사가 표시됨
		System.out.printf("%#x%n", 15);
		/* System.out.printf("%s", Integer.toBinaryString(15)); */ // 2진수로 15를 출력함
		
		double f = 123.456789f;
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f);
		System.out.printf("%g%n", f);
	}

}
