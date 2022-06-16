import java.util.*;

class ArraysEx {
	public static void main(String[] args) {
		int[]	arr   =  {0,1,2,3,4};
		int[][] arr2D =  {{11,12,13}, {21,22,23}};

		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));

		int[] arr2 = Arrays.copyOf(arr, arr.length); // index(5)
		int[] arr3 = Arrays.copyOf(arr, 3);          
		int[] arr4 = Arrays.copyOf(arr, 7);          
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  

		System.out.println("arr2="+ Arrays.toString(arr2));
		System.out.println("arr3="+ Arrays.toString(arr3));
		System.out.println("arr4="+ Arrays.toString(arr4));
		System.out.println("arr5="+ Arrays.toString(arr5));
		System.out.println("arr6="+ Arrays.toString(arr6));

		int[] arr7 =  new int[5];
		Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));

		for(int i : arr7) { // 향상된 for문
		/* for(int x=0;x<arr7.length;x++) { 
		 * 		int i = arr7[x]; 
		  } */
			char[] graph = new char[i]; // 새로운 char배열 i를 만듬
			Arrays.fill(graph, '*'); // i의 범위만큼 *를 채움
			System.out.println(new String(graph)+i); // 숫자만큼 *이 출력되고 +i
		}
		
		// 내용이 같은 2차원 배열
		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

		System.out.println(Arrays.equals(str2D, str2D2));      // false
		System.out.println(Arrays.deepEquals(str2D, str2D2));  // true

		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

		int idx = Arrays.binarySearch(chArr, 'B');
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B')); // 잘못된 결과가 출력 됨
		System.out.println("= After sorting =");
		Arrays.sort(chArr); // 배열을 정렬. 이진탐색 하기전에는 반드시 정렬먼저 해야함.
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
	}
}
