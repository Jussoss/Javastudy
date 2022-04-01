
public class Ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5명의 학생의 세 과목 점수를 더해서 총점과 평균을 계산하고, 과목별 총점을 계산하는 예제 */
		int[][] score = { // new int[5][3]
				{ 100, 100, 100 },
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 },
				{ 50, 50, 50 }
			};
		
		// 과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("  번호   국어    영어     수학      총점     평균");
		System.out.println("==============================");
		
		for(int i=0;i<score.length;i++) { // score.length = 0~4
			int sum = 0; // 개인별 총점을 sum에 저장
			float avg = 0.0f; // 개인별 평균을 avg에 저장(형변환)
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1); // i = 번호 1~5 출력 (학생의 수)
			
			for(int j=0;j<score[i].length;j++) { // score[i].length = 0~2
				sum += score[i][j]; // sum = 총점
				System.out.printf("%5d", score[i][j]); // 국영수 점수 출력
			}
			
			avg = sum/(float)score[i].length; // 평균 계산 (형변환)
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("==============================");
		System.out.printf("총점:%4d %4d %4d", korTotal, engTotal, mathTotal);
	}

}
