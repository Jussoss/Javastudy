
public class Ex2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �� ������ �� ��ȯ�ϱ�
		 * int x = 10, y = 20;
		 * int tmp; -> �� ��
		 * tmp = x; -> x�� ���� tmp�� ����
		 * x = y; x�� ���� y�� ����
		 * y = tmp; tmp�� ���� y�� ���� */
		
		int x = 4, y = 2;
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+x); //+�� ���� �տ� ���ڸ� ���� ���� ���
		System.out.println("y="+y);
	}

}
