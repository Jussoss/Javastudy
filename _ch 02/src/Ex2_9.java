import java.util.Scanner;

public class Ex2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ȭ�鿡�� �Է¹ޱ� - Scanner
		 * Scanner - ȭ�����κ��� �����͸� �Է¹޴� ����� �����ϴ� Ŭ���� 
		 * Scanner�� ����Ϸ���...
		 * 1. import�� �߰�
		 * = import java.util.*;
		 * 2. Scanner��ü�� ����
		 * Scanner scanner = new Scanner(System.in) �ý��� ���� ȭ���Է��� 
		 * 3. Scanner��ü�� ���
		 * int num = scanner.nextInt(); -> ȭ�鿡�� �Է¹��� ������ num�� ����
		 * String input = scanner.nextLine(); -> ȭ�鿡�� �Է¹��� ������ input�� ����
		 * int num = Integer.parseInt(input); -> ���ڿ�(input)�� ����(num)�� ��ȯ */
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * int num = scanner.nextInt(); 
		 * int num2 = scanner.nextInt();
		 * System.out.println(num); 
		 * System.out.println(num2);
		 */
		
		String input = scanner.nextLine(); //���δ����� �Է� ���� ��
		int num = Integer.parseInt(input); //���ڿ��� ���ڷ� ��ȯ
		
		System.out.println(num);
	}

}
