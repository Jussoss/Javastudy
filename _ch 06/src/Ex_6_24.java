
public class Ex_6_24 { /* abs�޼��� �ۼ� ����
						 * �޼���� : abs 
						 * �� �� : �־��� ���� ���밪�� ��ȯ�Ѵ�. 
						 * ��ȯŸ�� : int 
						 * �Ű����� : int value
						 */

	public static int abs(int value) {
		return value >=0 ? value : -value; // ���׿����� �̿�, value�� ���� ����̸� �״�� ��ȯ�ϰ�, �����̸� ��ȣ�� �ٲ㼭 ��ȯ
	} // abs
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"�� ���밪:"+abs(value));
		value = -10;
		System.out.println(value+"�� ���밪:"+abs(value));
	} // main

} // Ex_6_24
