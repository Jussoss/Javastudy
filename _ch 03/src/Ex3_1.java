
public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 연산자 : 연산을 수행하는 기호
		 * 피연산자 : 연산자의 연산 수행 대상
		 * x + 3 = x, 3 -> 피연산자 | + -> 연산자
		 * "모든 연산자는 연산결과를 반환한다" */
		
		/* 연산자의 종류 -> 자바의 정석 기초편 71p */
		/* 증감연산자 */
		int i=5, j=0;

		j = i++;	// 후위형
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);

		i=5;        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;

		j = ++i;	// 전위형
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
	}

}
