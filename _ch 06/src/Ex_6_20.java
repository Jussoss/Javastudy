
public class Ex_6_20 {/* shuffle�޼��� �ۼ�����
	 * �޼���� : shuffle 
	 * �� �� : �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��Ͽ� �ڼ��̰� �Ѵ�. ó���� �迭�� ��ȯ�Ѵ�.
	 * ��ȯŸ�� : int[] 
	 * �Ű����� : int[] arr - �������� ��� �迭
	 */

	public static int[] shuffle(int[] arr) {
		if(arr==null || arr.length==0) // ��ȿ��üũ, �迭�� null�̰ų� ũ�Ⱑ 0�̸� �״�� ��ȯ
			return arr;
		
		for(int i=0; i<arr.length; i++) {
			int j = (int) (Math.random()*arr.length); // �迭�� ��� ���� ��ġ�� �ݺ��ؼ� �ٲ�
			
			// arr[i]�� arr[j]�� ���� ���� �ٲ�
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		} // for
		
		return arr; // ó���� �迭�� ��ȯ
	} // shuffle
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	} // main
	
} // class Ex_6_20
