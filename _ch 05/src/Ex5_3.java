import java.util.Scanner;

public class Ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���ܾ �����ְ� �ܾ��� ���� ���ߴ� ���� */
		String[][] words = { //new words[3][2] ��� ��
				{"chair","����"},		 // words[0][0], words[0][1]
				{"computer","��ǻ��"}, // words[1][0], words[1][1]
				{"integer","����"}	 // words[2][0], words[2][1]
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) { // words.index 0~2
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]); //%d=10���� %s=���ڿ� %n=�ٹٲ�
			
			String tmp = scanner.nextLine(); // scanner�� ���� �� �پ� ���� ����
			
			if(tmp.equals(words[i][1])) { // equals�� ���ڿ��� ������ ������ �ٸ��� Ȯ���ϴµ� ���
				System.out.printf("�����Դϴ�.%n%n");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n", words[i][1]);
			}
		} //for�� ��
	} // main ��

}
