
public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������ : ������ �����ϴ� ��ȣ
		 * �ǿ����� : �������� ���� ���� ���
		 * x + 3 = x, 3 -> �ǿ����� | + -> ������
		 * "��� �����ڴ� �������� ��ȯ�Ѵ�" */
		
		/* �������� ���� -> �ڹ��� ���� ������ 71p */
		/* ���������� */
		int i=5, j=0;

		j = i++;	// ������
		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);

		i=5;        // ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		j=0;

		j = ++i;	// ������
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
	}

}
