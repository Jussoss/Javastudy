package ch14;

//[14-6] ���ڿ� �迭 strArr�� ���ڿ� �߿��� ���� �� ���� ���̸� ����Ͻÿ�.
import java.util.*;
import java.util.stream.*;

public class Ex14_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "aaa","bb","c", "dddd" };
		Stream<String> strStream = Stream.of(strArr);
		
		strStream.map(String::length) // strStream.map(s-> s.length())
			.sorted(Comparator.reverseOrder()) // ���ڿ� ���̷� ���� ����
			.limit(1)
			.forEach(System.out::println); // ���� �� ���ڿ��� ���� ���
	}

}