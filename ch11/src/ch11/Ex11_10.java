package ch11;
// [11-10] 다음 예제의 빙고판은 1~30사이의 숫자들로 만든 것인데, 숫자들의 위치가 잘
// 섞이지 않는다는 문제가 있다. 이러한 문제가 발생하는 이유와 이 문제를 개선하기 위한
// 방법을 설명하고, 이를 개선한 새로운 코드를 작성하시오.
import java.util.*;
public class Ex11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet(); // HashSet은 중복을 허용하지 않고 순서를 유지하지 않기 때문에 발생하는 문제
		int[][] board = new int[5][5];
		
		for(int i=0; set.size() < 25; i++) {
		set.add((int)(Math.random()*30)+1+"");
		}
		// 문제부분
		ArrayList list = new ArrayList(set); // 저장순서를 유지하는 ArrayList에 HashSet의 데이터를 옮겨 담은 다음,
		Collections.shuffle(list); // Collections.shuffle()을 이용해서 저장된 데이터들의 순서를 뒤섞음
		
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
