import java.util.*;

class LambdaEx4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			list.add(i);

		// list의 모든 요소를 출력
		list.forEach(i -> System.out.print(i + ",")); // 0,1,2,3,4,5,6,7,8,9,
		System.out.println();

		// Iterator it = list.iterator(); // 아래 문장을 위의 한줄로 변경
		// while(it.hasNext()) {
		// System.out.println(it.next());
		// }

		// list에서 2 또는 3의 배수를 제거한다.
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println(list); // 1, 5, 7

		list.replaceAll(i -> i * 10); // list의 각 요소에 10을 곱한다.
		System.out.println(list); // 10, 50, 70

		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");

		// map의 모든 요소를 {k,v}의 형식으로 출력한다.
		map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
		System.out.println(); // {1,1},{2,2},{3,3},{4,4},

		// Iterator it = list.iterator(); // 아래 문장을 위의 한줄로 변경
		// while(it.hasNext()) {
		// System.out.println(it.next());
		// }
	}
}
