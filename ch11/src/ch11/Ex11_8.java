package ch11;
// [11-8] ����11-7�� StudentŬ������ ����(total)�� �������(schoolRank)�� �����ϱ�
// ���� �ν��Ͻ������� �߰��Ͽ���. StudentŬ������ �⺻������ �̸�(name)�� �ƴ� ����
// (total)�� �������� �� ������������ ������ ����, ������ �������� �� �л��� ���������
// ����ϰ� ��������� �������� �������� �����Ͽ� ����Ͻÿ�.
import java.util.*;
class Student3 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total; // ����
	int schoolRank; // �������
	
	Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student3) {
			Student3 tmp = (Student3)o;
			
			return tmp.Total() - this.total; // ���� ����(��������)���� �����Ѵ�.
		} else {
			return -1;
		}
	}
	
	int Total() {
		// TODO Auto-generated method stub
		return 0;
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
				+","+schoolRank // �����߰�
				;
	}
} // class Student

public class Ex11_8 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ �����Ѵ�.
		
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		
		// 1. �ݺ����� �̿��ؼ� list�� ����� Student��ü�� �ϳ��� �д´�.
		for(int i=0;i < length; i++) {
		Student3 s = (Student3)list.get(i);
		
		// 1.1 ����(total)�� ��������(prevTotal)�� ������
		// ���� ���(prevRank)�� ���(schoolRank)�� �Ѵ�.
		if(s.Total()==prevTotal) {
		s.schoolRank = prevRank;
		} else {
		// 1.2 ������ ���� �ٸ���,
		// ���(schoolRank)�� ���� �˸°� ����ؼ� �����Ѵ�.
		// ������ �����ڿ��ٸ�, �� ���� ����� �������� ���� ����ؾ��Ѵ�.
		s.schoolRank = i + 1;
		}
		// 1.3 ���� ������ ����� ��������(prevTotal)�� �������(prevRank)�� �����Ѵ�.
		prevRank = s.schoolRank;
		prevTotal = s.total;
		} // for
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student3("���ڹ�",2,1,70,90,70));
		list.add(new Student3("���ڹ�",2,2,60,100,80));
		list.add(new Student3("ȫ�浿",1,3,100,100,100));
		list.add(new Student3("���ü�",1,1,90,70,80));
		list.add(new Student3("���ڹ�",1,2,80,80,90));
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		System.out.println(it.next());
		
	}
}
