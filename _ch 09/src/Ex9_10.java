// 결과값으로 나온 문자열을 정렬하는 예제

// 메서드명 : format
// 기 능 : 주어진 문자열을 지정된 크기의 문자열로 변환한다. 나머지 공간은 공백으로 채운다.
// 반환타입 : String
// 매개변수 : String str - 변환할 문자열
// int length - 변환된 문자열의 길이
// int alignment - 변환된 문자열의 정렬조건
// (0:왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)


public class Ex9_10 { // 문제 부분
	static String format(String str, int length, int alignment) {
		
		// 1. length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다.
		int diff = length - str.length();
		if(diff < 0) return str.substring(0, length);
		
		// 2. 1의 경우가 아니면, length크기의 char배열을 생성하고 공백으로 채운다.
		char[] source = str.toCharArray(); // 문자열을 char배열로 변환
		char[] result = new char[length];
		
		for(int i=0; i < result.length; i++)
		result[i] = ' '; // 배열 result를 공백으로 채운다.
		
		// 3. 정렬조건(alignment)의 값에 따라 문자열(str)을 복사할 위치를 결정한다.
		switch(alignment) {
		case 0 :
		default : 
			System.arraycopy(source, 0, result, 0, source.length); // source의 0번 값을 result의 0번째로 source의 인덱스 길이만큼  복사
			break;
		case 1 :
			System.arraycopy(source, 0, result, diff/2, source.length);
			break;
		case 2 :
			System.arraycopy(source, 0, result, diff, source.length);
			break;
		} // switch
		
		// 4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다.
		return new String(result);
	} // String format 문제 부분 끝
	
	
	public static void main(String[] args) {
		String str = "가나다";
		
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}

} // Ex9_10
