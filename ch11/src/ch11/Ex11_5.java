package ch11;
// [11-5] ������ ���õ� StudentŬ������ Comparable�������̽��� �����ϵ��� �����ؼ�
// �̸�(name)�� �⺻ ���ı����� �ǵ��� �Ͻÿ�.
import java.util.*;

class Student implements Comparable  { // �⺻ ���ı��� ����
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
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
		return name +","+ban +","+no +","+kor +","+eng +","+math
				+","+getTotal() +","+getAverage();
	}
	
	// ���� �κ�
	public int compareTo(Object o) { 
		if(o instanceof Student) { // ����ȯ
			Student tmp = (Student)o;
			return name.compareTo(tmp.name); // StringŬ������ compareTo()�� ȣ�� 
		} else {
			return -1; // ���� ����� �ƴϸ� ���� �� ��ȯ 
		} 
	}

	public int Total() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
} // class Student

public class Ex11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student("ȫ�浿",1,1,100,100,100));
		list.add(new Student("���ü�",1,2,90,70,80));
		list.add(new Student("���ڹ�",1,3,80,80,90));
		list.add(new Student("���ڹ�",1,4,70,90,70));
		list.add(new Student("���ڹ�",1,5,60,100,80));
		
		Collections.sort(list); // list�� ����� ��ҵ��� �����Ѵ�.(compareTo()ȣ��) comparable�� ���ı��� ����
		Iterator it = list.iterator();
		
		while(it.hasNext()) // �о�� ��� Ȯ��
			System.out.println(it.next()); // ȣ��
	}
}
