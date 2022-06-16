import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // 기본 길이(용량, capacity)가 10인 ArrayList를 생성
		// ArrayList에는 객체만 저장가능
		// autoboxing에 의해 기본형이 참조형으로 자동 변환
		/* list1.add(new Integer(5)); */
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1,4)); // subList는 읽기전용
		print(list1, list2);
		
		// Collection은 인터페이스, Collections는 유틸 클래스
		Collections.sort(list1);	// list1과 list2를 정렬한다. sort는 메서드는 정렬
		Collections.sort(list2);	// Collections.sort(List l)
		print(list1, list2);

		// list1에 list2의 모든 요소를 포함하고 있는지 확인하는 메서드 contains
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 추가할 위치(index), 추가할 값
		print(list1, list2);

		// 변경하는 메서드 set
		list2.set(3, "AA"); // index, 값
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));	
		print(list1, list2); // 1, 4, 5 삭제
		
		//  list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	} // main의 끝

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class
