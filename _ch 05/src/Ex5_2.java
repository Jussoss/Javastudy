
public class Ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5���� �л��� �� ���� ������ ���ؼ� ������ ����� ����ϰ�, ���� ������ ����ϴ� ���� */
		int[][] score = { // new int[5][3]
				{ 100, 100, 100 },
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 },
				{ 50, 50, 50 }
			};
		
		// ���� ����
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("  ��ȣ   ����    ����     ����      ����     ���");
		System.out.println("==============================");
		
		for(int i=0;i<score.length;i++) { // score.length = 0~4
			int sum = 0; // ���κ� ������ sum�� ����
			float avg = 0.0f; // ���κ� ����� avg�� ����(����ȯ)
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1); // i = ��ȣ 1~5 ��� (�л��� ��)
			
			for(int j=0;j<score[i].length;j++) { // score[i].length = 0~2
				sum += score[i][j]; // sum = ����
				System.out.printf("%5d", score[i][j]); // ������ ���� ���
			}
			
			avg = sum/(float)score[i].length; // ��� ��� (����ȯ)
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("==============================");
		System.out.printf("����:%4d %4d %4d", korTotal, engTotal, mathTotal);
	}

}
