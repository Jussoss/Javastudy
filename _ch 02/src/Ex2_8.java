
public class Ex2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* println()�� ���� - �������� �����Ұ�
		 * 1. �Ǽ��� �ڸ��� �����Ұ� - �Ҽ��� n�ڸ��� ����Ϸ���?
		 * System.out.println(10.0/3); -> 3.333333...
		 * 2. 10�����θ� ��µȴ�. - 8����, 16������ ����Ϸ���?
		 * System.out.println(0x1A); -> 26 */
		
		/* printf()�� ������� ��������
		 * System.out.printf("%.2f", 10.0/3); -> �Ҽ��� �ι�° �ڸ������� ǥ���Ѵٴ� �� 3.33
		 * System.out.printf("%d", 0x1A); -> %d�� 10���� 26 
		 * System.out.printf("%X", 0x1A); -> %X�� 16���� 1A*/ 
		System.out.printf("%d%n", 15); // %n�� �ٹٲ�
		System.out.printf("%#o%n", 15); // #�� ���λ簡 ǥ�õ�
		System.out.printf("%#x%n", 15);
		/* System.out.printf("%s", Integer.toBinaryString(15)); */ // 2������ 15�� �����
		
		double f = 123.456789f;
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f);
		System.out.printf("%g%n", f);
	}

}
