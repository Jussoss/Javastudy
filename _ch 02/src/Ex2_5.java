
public class Ex2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문자와 문자열
		 * char ch = 'A';
		 * char ch = 'AB'; -> 에러
		 * String s = "ABC"; -> 문자열이므로 OK
		 * String s = "A"; -> 하나의 문자만 사용해도 됨
		 * String s = ""; -> 빈 문자열도 가능
		 * char ch = ''; -> 에러 */
		
		/* String s1 = "A" + "B"; -> "AB" 문자열 결합
		 * "" + 7 ->"" + "7" -> "7" 빈 문자열과 숫자를 더하면 숫자가 문자열이 됨
		 * ""+7+7 -> "7"+7 -> "7"+"7" -> "77"
		 * 7+7+"" -> 14+"" -> "14"+"" -> "14"
		 * 문자열 + any type -> 문자열
		 * any type + 문자열 -> 문자열 */
		
		char ch = 'A';
		int i = 'A'; //문자 A는 int타입으로 65가 됨
		
		String str = ""; //빈 문자열(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		
		System.out.println(str4);
		System.out.println(""+7+7);
		System.out.println(7+7+"");
	}

}
