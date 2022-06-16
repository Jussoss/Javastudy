import java.util.*;

class LambdaEx4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			list.add(i);

		// list�� ��� ��Ҹ� ���
		list.forEach(i -> System.out.print(i + ",")); // 0,1,2,3,4,5,6,7,8,9,
		System.out.println();

		// Iterator it = list.iterator(); // �Ʒ� ������ ���� ���ٷ� ����
		// while(it.hasNext()) {
		// System.out.println(it.next());
		// }

		// list���� 2 �Ǵ� 3�� ����� �����Ѵ�.
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println(list); // 1, 5, 7

		list.replaceAll(i -> i * 10); // list�� �� ��ҿ� 10�� ���Ѵ�.
		System.out.println(list); // 10, 50, 70

		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");

		// map�� ��� ��Ҹ� {k,v}�� �������� ����Ѵ�.
		map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
		System.out.println(); // {1,1},{2,2},{3,3},{4,4},

		// Iterator it = list.iterator(); // �Ʒ� ������ ���� ���ٷ� ����
		// while(it.hasNext()) {
		// System.out.println(it.next());
		// }
	}
}
