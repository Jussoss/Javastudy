package ch14;

//[14-5] ���ڿ� �迭 strArr�� ��� ���ڿ��� ���̸� ���� ����� ����Ͻÿ�.
import java.util.stream.*;

public class Ex14_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "aaa","bb","c", "dddd" };
		Stream<String> strStream = Stream.of(strArr);
		
		// int sum = strStream.mapToInt(s -> s.length()).sum(); // ���ٽ�
		int sum = strStream.mapToInt(String::length).sum();
		System.out.println("sum="+sum);
	}

}