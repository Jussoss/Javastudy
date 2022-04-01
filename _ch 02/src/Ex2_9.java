import java.util.Scanner;

public class Ex2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 화면에서 입력받기 - Scanner
		 * Scanner - 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스 
		 * Scanner를 사용하려면...
		 * 1. import문 추가
		 * = import java.util.*;
		 * 2. Scanner객체의 생성
		 * Scanner scanner = new Scanner(System.in) 시스템 인은 화면입력임 
		 * 3. Scanner객체를 사용
		 * int num = scanner.nextInt(); -> 화면에서 입력받은 정수를 num에 저장
		 * String input = scanner.nextLine(); -> 화면에서 입력받은 내용을 input에 저장
		 * int num = Integer.parseInt(input); -> 문자열(input)을 숫자(num)로 변환 */
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * int num = scanner.nextInt(); 
		 * int num2 = scanner.nextInt();
		 * System.out.println(num); 
		 * System.out.println(num2);
		 */
		
		String input = scanner.nextLine(); //라인단위로 입력 받을 때
		int num = Integer.parseInt(input); //문자열을 숫자로 변환
		
		System.out.println(num);
	}

}
