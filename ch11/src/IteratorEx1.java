import java.util.*;

class IteratorEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator(); // iterator ȣ��
		// Iterator�� 1ȸ���̶� �� ������ �ٽ� ���;� �Ѵ�.
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		/*
		 * for(int i=0;i<list.size();i++) { 
		 * 		Object obj = list.get(i);
		 * 		System.out.println(obj); 
		 * }
		 */
	} // main
}
