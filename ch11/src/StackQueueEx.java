import java.util.*;

class StackQueueEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();	 // Queue인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) { // 스택이 비었는지 확인
			System.out.println(st.pop()); // 요소 하나 꺼내기
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) { // 큐가 비었는지 확인
			System.out.println(q.poll()); // 요소 하나 꺼내기
		}
	}
}
