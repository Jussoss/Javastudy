class Data3 { int x; }

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ��ȯŸ�� ����
		Data3 d = new Data3(); 		// 1. main�޼��忡 ��ü Data3 d ����
		d.x = 10; 					// 2. d�� �ִ� x���� 10���� ����
		
		Data3 d2 = copy(d);			// 3. main�޼��忡 ��ü Data3 d2�� ������� = copy�޼��忡 (main�޼��� d ���� ����)
									// 8. ��ȯ�� tmp���� main�޼��� d2��ü�� ���� ��  ��d2�� ���ο� Data3()�� ����Ű�� ��
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
	}

	static Data3 copy(Data3 d) {	// 4. copy�޼��忡 (Data3Ÿ�� ������d�� �������)
		Data3 tmp = new Data3();	// 5. copy�޼��忡 ��ü tmp ���� = ���ο� Data3() ����
		
		tmp.x = d.x;				// 6. copy�� �������� d.x���� tmp.x�� ����
		
		return tmp;					// 7. ��ȯŸ���� ������Data3�� �� ��ü�� �ּҸ� ��ȯ��
	}
}
