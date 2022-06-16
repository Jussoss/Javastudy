package ch14;

//[14-5] 문자열 배열 strArr의 모든 문자열의 길이를 더한 결과를 출력하시오.
import java.util.stream.*;

public class Ex14_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "aaa","bb","c", "dddd" };
		Stream<String> strStream = Stream.of(strArr);
		
		// int sum = strStream.mapToInt(s -> s.length()).sum(); // 람다식
		int sum = strStream.mapToInt(String::length).sum();
		System.out.println("sum="+sum);
	}

}