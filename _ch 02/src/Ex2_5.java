
public class Ex2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���ڿ� ���ڿ�
		 * char ch = 'A';
		 * char ch = 'AB'; -> ����
		 * String s = "ABC"; -> ���ڿ��̹Ƿ� OK
		 * String s = "A"; -> �ϳ��� ���ڸ� ����ص� ��
		 * String s = ""; -> �� ���ڿ��� ����
		 * char ch = ''; -> ���� */
		
		/* String s1 = "A" + "B"; -> "AB" ���ڿ� ����
		 * "" + 7 ->"" + "7" -> "7" �� ���ڿ��� ���ڸ� ���ϸ� ���ڰ� ���ڿ��� ��
		 * ""+7+7 -> "7"+7 -> "7"+"7" -> "77"
		 * 7+7+"" -> 14+"" -> "14"+"" -> "14"
		 * ���ڿ� + any type -> ���ڿ�
		 * any type + ���ڿ� -> ���ڿ� */
		
		char ch = 'A';
		int i = 'A'; //���� A�� intŸ������ 65�� ��
		
		String str = ""; //�� ���ڿ�(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		
		System.out.println(str4);
		System.out.println(""+7+7);
		System.out.println(7+7+"");
	}

}
