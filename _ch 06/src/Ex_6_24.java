
public class Ex_6_24 { /* abs메서드 작성 문제
						 * 메서드명 : abs 
						 * 기 능 : 주어진 값의 절대값을 반환한다. 
						 * 반환타입 : int 
						 * 매개변수 : int value
						 */

	public static int abs(int value) {
		return value >=0 ? value : -value; // 삼항연산자 이용, value의 값이 양수이면 그대로 반환하고, 음수이면 부호를 바꿔서 반환
	} // abs
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	} // main

} // Ex_6_24
