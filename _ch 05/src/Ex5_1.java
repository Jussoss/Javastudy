
public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2차원 배열 score의 모든 요소의 합을 구하고, 출력하는 예제 */
		int[][] score = { //각 행마다 크기를 다르게 줄 수 있으나 대부분 정사각형 형태임
				{ 100, 100 },
				{ 20, 20, 20, 20 },
				{ 30, 30 },
				{ 40 }
		};
		int sum = 0;
		// 2중 for문 사용
		for (int i=0;i<score.length;i++) { //score.length = 4 행의 길이 0~3
			for (int j=0;j<score[i].length;j++) { //i는 0~3 score[0].length = 3 열의 길이
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		
		System.out.println("sum="+sum);
	}

}
