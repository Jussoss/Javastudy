
public class Ex_6_22 {/* isNumber�޼��� �ۼ�����
						 * �޼���� : isNumber 
						 * �� �� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�. ��� ���ڷθ� �̷���� ������ true�� ��ȯ�ϰ�, �׷��� ������ false�� ��ȯ�Ѵ�. 
						 * ���� �־��� ���ڿ��� null�̰ų� ���ڿ������̶�� false�� ��ȯ�Ѵ�. 
						 * ��ȯŸ�� : boolean 
						 * �Ű����� : String str - �˻��� ���ڿ�
						 * [Hint] StringŬ������ charAt(int i)�޼��带 ����ϸ� ���ڿ��� i��° ��ġ�� ���ڸ� ���� �� �ִ�.
						 */

	public static boolean isNumber(String str) {
		if(str==null || str.equals("")) // ��ȿ��üũ
			return false; // �־��� ���ڿ��� null�̰ų� ���ڿ������̶�� false�� ��ȯ
		
			for(int i=0; i< str.length();i++) {
			char ch = str.charAt(i); // charŸ���� ���� ch�� ����
			
			if(ch < '0' || ch > '9') {
			return false; // ch�� ���ڰ� �ƴϸ� false�� ��ȯ
			}
			
		} // for
			return true; // ��� ���ڷθ� �̷���� ������ true�� ��ȯ
			
	} // isNumber
	
			public static void main(String[] args) {
			String str = "123";
			System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
			
			str = "1234o";
			System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
			}
} // class Ex_6_22