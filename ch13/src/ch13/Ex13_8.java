package ch13;
// [13-8] ������ �ڵ�� �ؽ�Ʈ����� Ÿ�ڿ��������ε� WordGenerator��� �����尡
// Vector�� 2�ʸ��� �ܾ �ϳ��� �߰��ϰ�, ����ڰ� �ܾ �Է��ϸ� Vector���� ��ġ�ϴ�
// �ܾ �����ϵ��� �Ǿ� �ִ�. WordGenerator�� run()�� �ϼ��Ͻÿ�.
import java.util.*;

public class Ex13_8 {
	Vector words = new Vector();
	String[] data = {"�¿�","����","����","ȿ��","����","����","Ƽ�Ĵ�","���","����ī"};
	int interval = 2 * 1000; // 2��
	WordGenerator wg = new WordGenerator();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex13_8 game = new Ex13_8();
		
		game.wg.start(); // �ܾ �����ϴ� �����带 �����Ų��.
		
		Vector words = game.words;
		
		while(true) {
			System.out.println(words);
		
			String prompt = ">>";
			System.out.print(prompt);
		
			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
		
			int index = words.indexOf(input); // �Է¹��� �ܾ words���� ã�´�.
		
			if(index!=-1) { // ã����
				words.remove(index); // words���� �ش� �ܾ �����Ѵ�.
			}
		}
	} // main
	
	class WordGenerator extends Thread {
		public void run() {
			while(true) {
				// 1. interval(2��)���� �迭 data�� �� �� �ϳ��� ���Ƿ� �����ؼ�
				int rand = (int)(Math.random()*data.length);
				
				// 2. words�� �����Ѵ�.
				words.add(data[rand]);
				
				try {
					Thread.sleep(interval); // 2��(interval) ���� ����.
				} catch(Exception e) {}
			}
		} // end of run()
	} // class WordGenerator
}
