package ch14;

//[14-7] ������ �ζǹ�ȣ(1~45)�� �����ؼ� ����Ͻÿ�.
import java.util.*;

public class Ex14_7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Random().ints(1,46) // 1~45������ ����(46�� ���Ծȵ�)
					.distinct() // �ߺ�����
					.limit(6) // 6����
					.sorted() // ����
					.forEach(System.out::println); // ȭ�鿡 ���
	}
}
