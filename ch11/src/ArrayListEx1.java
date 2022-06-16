import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // �⺻ ����(�뷮, capacity)�� 10�� ArrayList�� ����
		// ArrayList���� ��ü�� ���尡��
		// autoboxing�� ���� �⺻���� ���������� �ڵ� ��ȯ
		/* list1.add(new Integer(5)); */
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1,4)); // subList�� �б�����
		print(list1, list2);
		
		// Collection�� �������̽�, Collections�� ��ƿ Ŭ����
		Collections.sort(list1);	// list1�� list2�� �����Ѵ�. sort�� �޼���� ����
		Collections.sort(list2);	// Collections.sort(List l)
		print(list1, list2);

		// list1�� list2�� ��� ��Ҹ� �����ϰ� �ִ��� Ȯ���ϴ� �޼��� contains
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // �߰��� ��ġ(index), �߰��� ��
		print(list1, list2);

		// �����ϴ� �޼��� set
		list2.set(3, "AA"); // index, ��
		print(list1, list2);
		
		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));	
		print(list1, list2); // 1, 4, 5 ����
		
		//  list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	} // main�� ��

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class
