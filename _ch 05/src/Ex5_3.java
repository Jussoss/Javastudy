import java.util.Scanner;

public class Ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 영단어를 보여주고 단어의 뜻을 맞추는 예제 */
		String[][] words = { //new words[3][2] 행과 열
				{"chair","의자"},		 // words[0][0], words[0][1]
				{"computer","컴퓨터"}, // words[1][0], words[1][1]
				{"integer","정수"}	 // words[2][0], words[2][1]
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) { // words.index 0~2
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]); //%d=10진수 %s=문자열 %n=줄바꿈
			
			String tmp = scanner.nextLine(); // scanner를 통해 한 줄씩 값을 받음
			
			if(tmp.equals(words[i][1])) { // equals는 문자열의 내용이 같은지 다른지 확인하는데 사용
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		} //for문 끝
	} // main 끝

}
