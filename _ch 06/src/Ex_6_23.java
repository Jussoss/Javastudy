
public class Ex_6_23 { /* max�޼��� �ۼ�����
						 * �޼���� : max 
						 * �� �� : �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ�Ѵ�. 
						 * ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�ΰ��, -999999�� ��ȯ�Ѵ�. 
						 * ��ȯŸ�� : int �Ű����� : int[] arr - �ִ밪�� ���� �迭
						 */

	public static int max(int[] arr) {
		if(arr==null || arr.length==0) // �Ű������� �Ѱܹ��� �迭 arr�� null�̰ų� ũ�Ⱑ 0�̸� -999999�� ��ȯ
			return -999999;
			int max = arr[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ
			
			for(int i=1; i< arr.length;i++) { // �ִ밪 max�� �迭�� ù ��° ������ �ʱ�ȭ �����Ƿ� �迭�� �� ��° ������ ��
			if(arr[i] > max) // �迭�� i�� ° ��Ұ� max���� ũ��
			max = arr[i];
		}
			return max; // �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ
			
	} // max
	
			public static void main(String[] args) {
			int[] data = {3,2,9,4,7};
			
			System.out.println(java.util.Arrays.toString(data));
			System.out.println("�ִ밪:"+max(data));
			System.out.println("�ִ밪:"+max(null));
			System.out.println("�ִ밪:"+max(new int[]{})); // ũ�Ⱑ 0�� �迭

	}

} // Ex_6_23
