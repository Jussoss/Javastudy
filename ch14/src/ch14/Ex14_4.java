package ch14;

//[14-4] 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
//[Hint] 배열을 사용하시오.
import java.util.*;
import java.util.stream.*;

public class Ex14_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> die = IntStream.rangeClosed(1,6).boxed();
		
		die.flatMap(i-> Stream.of(1,2,3,4,5,6).map(i2 -> new int[]{ i, i2 })) 
		.filter(iArr-> iArr[0]+iArr[1]==6) // 두 개의 합이 6이 되게 함
		.forEach(iArr -> System.out.println(Arrays.toString(iArr)));
	}

}
