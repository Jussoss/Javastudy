
public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2���� �迭 score�� ��� ����� ���� ���ϰ�, ����ϴ� ���� */
		int[][] score = { //�� �ึ�� ũ�⸦ �ٸ��� �� �� ������ ��κ� ���簢�� ������
				{ 100, 100 },
				{ 20, 20, 20, 20 },
				{ 30, 30 },
				{ 40 }
		};
		int sum = 0;
		// 2�� for�� ���
		for (int i=0;i<score.length;i++) { //score.length = 4 ���� ���� 0~3
			for (int j=0;j<score[i].length;j++) { //i�� 0~3 score[0].length = 3 ���� ����
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		
		System.out.println("sum="+sum);
	}

}
