
public class Ex2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���ͷ��� ���λ�� ���̻�
		 *  ����		���ͷ�							���̻�
		 * ����		false, true						����
		 * ������		123, 0b0101, 077, 0xFF, 100L	L(L�� ������ longŸ����)
		 * �Ǽ���		3.14, 3.0e8, 1.4f, 0x1.0p-1		f(float), d(double) d�� ��������
		 * ������		'A', '1', '\n'					����
		 * ���ڿ�		"ABC", "123", "A", "true"		���� */
		
		/* boolean power = true; or false;
		 * char ch = 'A';
		 * String str = "ABC";
		 * byte b = 127; int Ÿ��(byte�� -128~127���� ���尡��)
		 * byte b = 128; ����(128�� �������� ����� ����)*/
		
		/* int i = 100; 10����
		 * int oct = 0100; ������ ���ͷ� �տ� 0�� ������ 8����
		 * int hex = 0x100; 0x�� ������ 16����
		 * int b = 0b0101; 0b�� ������ 2����
		 * 1e3 -> 1000.0d e�� 10�� ������ ���� */
		
		/* long l = 10_000_000_000L; L���� �Ұ���
		 * long l = 100; intŸ�Կ����� ������ ������ L���� ����
		 * float f = 3.14f; f���� �Ұ�
		 * double d = 3.14d; d���� ���� */
		
		/* ������ ���ͷ��� Ÿ�� ����ġ
		 * 1. ������ '���� > ���ͷ�'�� ���, OK
		 * 		int i = 'A'; -> int > char
		 * 		long l = 123; -> long > int
		 * 		double d = 3.14f; double > float 
		 * 2. ������ '���� < ���ͷ�'�� ���, ����
		 * 		int i = 3_000_000_000; -> int�� ���� (��20��) ���
		 * 		long l = 3.14f; -> long < float
		 * 		float f = 3.14; float < double
		 * 3. byte, short ������ int���ͷ� ���尡��(��, ������ Ÿ���� ���� �̳��̾�� ��)
		 * 		byte b = 100; -> OK. byte�� ����(-128~127)�� ����
		 * 		byte b = 128; -> ����. byte�� ������ ��� */
		boolean power = true;
		
		byte b = 127; // -128~127
		
		int oct = 010; // 8����, 10������ 8
		int hex = 0x10; // 16����, 10������16
		
		long l = 10_000_000_000L;
		
		float f = 3.14f;
		double d = 3.14f; // double�� float���� ������ �б⶧���� ����
		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f); //���̻�� ��µ�������
		System.out.println(1e3);
	}

}
