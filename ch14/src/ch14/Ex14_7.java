package ch14;

//[14-7] 임의의 로또번호(1~45)를 정렬해서 출력하시오.
import java.util.*;

public class Ex14_7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Random().ints(1,46) // 1~45사이의 정수(46은 포함안됨)
					.distinct() // 중복제거
					.limit(6) // 6개만
					.sorted() // 정렬
					.forEach(System.out::println); // 화면에 출력
	}
}
