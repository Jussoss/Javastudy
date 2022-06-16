package ch11;
// [11-7] ������ ���õ� BanNoAscendingŬ������ �ϼ��Ͽ�, ArrayList�� ��� Student�ν��Ͻ�����
// ��(ban)�� ��ȣ(no)�� �������� ���ĵǰ� �Ͻÿ�.(���� ���� ��� ��ȣ�� ���ؼ� �����Ѵ�.)
import java.util.*;

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	public String toString() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				;
	}
} // class Student2

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		if(o1 instanceof Student2 && o2 instanceof Student2) { // ����ȯ
			Student2 s1 = (Student2)o1;
			Student2 s2 = (Student2)o2;
		int result = s1.ban - s2.ban; // ���� ��
		
		if(result==0) { // ���� ������, ��ȣ�� ���Ѵ�.
			return s1.no - s2.no;
		}
		return result;
	}
	return -1;
} // class BanNoAscending

public static class Ex11_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student2("���ڹ�",2,1,70,90,70));
		list.add(new Student2("���ڹ�",2,2,60,100,80));
		list.add(new Student2("ȫ�浿",1,3,100,100,100));
		list.add(new Student2("���ü�",1,1,90,70,80));
		list.add(new Student2("���ڹ�",1,2,80,80,90));
		
		Collections.sort(list, new BanNoAscending());
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		System.out.println(it.next());
	}

} // Ex11_7
