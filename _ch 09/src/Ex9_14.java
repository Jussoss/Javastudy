// 다음은 화면으로부터 전화번호의 일부를 입력받아 일치하는 전화번호를 주어진 문자열 배열에서 찾아서 출력하는 프로그램이다. 알맞은 코드를 넣어 프로그램을 완성하시오. 
// [Hint] Pattern, Matcher클래스를 사용하라. 

import java.util.*;
import java.util.regex.*;


public class Ex9_14 {

	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
				};
		
		Vector list = new Vector(); // 검색결과를 담을 Vector
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim(); // trim()으로 입력내용에서 공백을 제거
			if(input.equals("")) {
				continue;
			} else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			
			// 문제부분
			String pattern = ".*"+input+".*"; // input을 포함하는 모든 문자열
			Pattern p = Pattern.compile(pattern); // pattern() : 컴파일된 정규표현식을 String 형태로 반환합니다.
			
			for(int i=0; i< phoneNumArr.length;i++) {
				String phoneNum = phoneNumArr[i];
				String tmp = phoneNum.replace("-",""); // phoneNum에서 '-'를 제거
				
				Matcher m = p.matcher(tmp); // matcher(CharSequence input) : 대상 문자열이 패턴과 일치할 경우 true를 반환합니다.
			
			if(m.find()) { // 패턴과 일치하면, list에 phoneNum을 추가한다.
				list.add(phoneNum);
			}
		} // for 문제부분 끝
			
			if(list.size()>0) { // 검색결과가 있으면
					System.out.println(list); // 검색결과를 출력하고
					list.clear(); // 검색결과를 삭제
				} else {
					System.out.println("일치하는 번호가 없습니다.");
				}
		} // while
	} // main
}
