
public class Ex_6_22 {/* isNumber메서드 작성문제
						 * 메서드명 : isNumber 
						 * 기 능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다. 모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다. 
						 * 만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다. 
						 * 반환타입 : boolean 
						 * 매개변수 : String str - 검사할 문자열
						 * [Hint] String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.
						 */

	public static boolean isNumber(String str) {
		if(str==null || str.equals("")) // 유효성체크
			return false; // 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환
		
			for(int i=0; i< str.length();i++) {
			char ch = str.charAt(i); // char타입의 변수 ch에 저장
			
			if(ch < '0' || ch > '9') {
			return false; // ch가 숫자가 아니면 false를 반환
			}
			
		} // for
			return true; // 모두 숫자로만 이루어져 있으면 true를 반환
			
	} // isNumber
	
			public static void main(String[] args) {
			String str = "123";
			System.out.println(str+"는 숫자입니까? "+isNumber(str));
			
			str = "1234o";
			System.out.println(str+"는 숫자입니까? "+isNumber(str));
			}
} // class Ex_6_22