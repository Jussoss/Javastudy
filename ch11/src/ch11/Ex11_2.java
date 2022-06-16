package ch11;
// [11-2] 다음 코드의 실행결과를 적으시오.
import java.util.*;

public class Ex11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list); // 중복요소들이 제거되고 순서유지 안됨 2,6,3,7
		TreeSet tset = new TreeSet(set); // 오름차순으로 정렬된다. 2,3,6,7
		Stack stack = new Stack(); // Stack에 넣었다 꺼내면 저장순서가 반대가 된다.
		stack.addAll(tset); // TreeSet의 저장된 모든 요소를 stack에 담는다.
		
		while(!stack.empty()) // 스택이 비어있지 않을 때 true
		System.out.println(stack.pop()); // stack에 저장된 값을 하나씩 꺼낸다.
	}

}
