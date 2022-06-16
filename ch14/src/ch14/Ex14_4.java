package ch14;

//[14-4] �� ���� �ֻ����� ������ ���� ���� ���� 6�� ��츦 ��� ����Ͻÿ�.
//[Hint] �迭�� ����Ͻÿ�.
import java.util.*;
import java.util.stream.*;

public class Ex14_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> die = IntStream.rangeClosed(1,6).boxed();
		
		die.flatMap(i-> Stream.of(1,2,3,4,5,6).map(i2 -> new int[]{ i, i2 })) 
		.filter(iArr-> iArr[0]+iArr[1]==6) // �� ���� ���� 6�� �ǰ� ��
		.forEach(iArr -> System.out.println(Arrays.toString(iArr)));
	}

}
