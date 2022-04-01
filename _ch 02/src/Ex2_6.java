
public class Ex2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 두 변수의 값 교환하기
		 * int x = 10, y = 20;
		 * int tmp; -> 빈 컵
		 * tmp = x; -> x의 값을 tmp에 저장
		 * x = y; x의 값을 y에 저장
		 * y = tmp; tmp의 값을 y에 저장 */
		
		int x = 4, y = 2;
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+x); //+는 숫자 앞에 글자를 붙일 때도 사용
		System.out.println("y="+y);
	}

}
