// ��������� ���� ���ڿ��� �����ϴ� ����

// �޼���� : format
// �� �� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ�Ѵ�. ������ ������ �������� ä���.
// ��ȯŸ�� : String
// �Ű����� : String str - ��ȯ�� ���ڿ�
// int length - ��ȯ�� ���ڿ��� ����
// int alignment - ��ȯ�� ���ڿ��� ��������
// (0:���� ����, 1: ��� ����, 2:������ ����)


public class Ex9_10 { // ���� �κ�
	static String format(String str, int length, int alignment) {
		
		// 1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�.
		int diff = length - str.length();
		if(diff < 0) return str.substring(0, length);
		
		// 2. 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���.
		char[] source = str.toCharArray(); // ���ڿ��� char�迭�� ��ȯ
		char[] result = new char[length];
		
		for(int i=0; i < result.length; i++)
		result[i] = ' '; // �迭 result�� �������� ä���.
		
		// 3. ��������(alignment)�� ���� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�.
		switch(alignment) {
		case 0 :
		default : 
			System.arraycopy(source, 0, result, 0, source.length); // source�� 0�� ���� result�� 0��°�� source�� �ε��� ���̸�ŭ  ����
			break;
		case 1 :
			System.arraycopy(source, 0, result, diff/2, source.length);
			break;
		case 2 :
			System.arraycopy(source, 0, result, diff, source.length);
			break;
		} // switch
		
		// 4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�.
		return new String(result);
	} // String format ���� �κ� ��
	
	
	public static void main(String[] args) {
		String str = "������";
		
		System.out.println(format(str,7,0)); // ���� ����
		System.out.println(format(str,7,1)); // ��� ����
		System.out.println(format(str,7,2)); // ������ ����
	}

} // Ex9_10
