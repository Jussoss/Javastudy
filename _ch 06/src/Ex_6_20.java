
public class Ex_6_20 {/* shuffle메서드 작성문제
	 * 메서드명 : shuffle 
	 * 기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. 처리한 배열을 반환한다.
	 * 반환타입 : int[] 
	 * 매개변수 : int[] arr - 정수값이 담긴 배열
	 */

	public static int[] shuffle(int[] arr) {
		if(arr==null || arr.length==0) // 유효성체크, 배열이 null이거나 크기가 0이면 그대로 반환
			return arr;
		
		for(int i=0; i<arr.length; i++) {
			int j = (int) (Math.random()*arr.length); // 배열에 담긴 값의 위치를 반복해서 바꿈
			
			// arr[i]와 arr[j]의 값을 서로 바꿈
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		} // for
		
		return arr; // 처리한 배열을 반환
	} // shuffle
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	} // main
	
} // class Ex_6_20
