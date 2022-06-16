package ch11;
// [11-10] ���� ������ �������� 1~30������ ���ڵ�� ���� ���ε�, ���ڵ��� ��ġ�� ��
// ������ �ʴ´ٴ� ������ �ִ�. �̷��� ������ �߻��ϴ� ������ �� ������ �����ϱ� ����
// ����� �����ϰ�, �̸� ������ ���ο� �ڵ带 �ۼ��Ͻÿ�.
import java.util.*;
public class Ex11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet(); // HashSet�� �ߺ��� ������� �ʰ� ������ �������� �ʱ� ������ �߻��ϴ� ����
		int[][] board = new int[5][5];
		
		for(int i=0; set.size() < 25; i++) {
		set.add((int)(Math.random()*30)+1+"");
		}
		// �����κ�
		ArrayList list = new ArrayList(set); // ��������� �����ϴ� ArrayList�� HashSet�� �����͸� �Ű� ���� ����,
		Collections.shuffle(list); // Collections.shuffle()�� �̿��ؼ� ����� �����͵��� ������ �ڼ���
		
		Iterator it = /* Set */list.iterator();
		
		for(int i=0; i < board.length; i++) {
			for(int j=0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? " " : " ")
						+ board[i][j]);
			}
			System.out.println();
		}
		
	} // main

}
