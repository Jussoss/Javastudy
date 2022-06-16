package ch11;
// [11-9] ����11-8�� StudentŬ������ �ݵ��(classRank)�� �����ϱ� ���� �ν��Ͻ�������
// �߰��Ͽ���. �ݵ���� ����ϰ� �ݰ� �ݵ���� �������� �����Ͽ� ����� ����Ͻÿ�.
// (1)~(2)�� �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
import java.util.*;
class Student4 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // �������
	int classRank; // �ݵ��
	Student4(String name, int ban, int no, int kor, int eng, int math) {
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
			if(o instanceof Student4) {
				Student4 tmp = (Student4)o;
				return tmp.total - this.total;
			} else {
				return -1;
			}
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
		+","+schoolRank
		+","+classRank // �����߰�
		;
	}
} // class Student4

class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student4 s1 = (Student4)o1;
		Student4 s2 = (Student4)o2;
		
		int result = s1.ban - s2.ban; // ��(ban) ���� ����(��������)
		
		if(result==0)
			result = s2.total - s1.total; // ����(total) ���� ����(��������)
		
		return result;
	}
}

public class Ex11_9 {
	public static void calculateClassRank(List list) {
		// ���� �ݺ� �������� ������������ �����Ѵ�.
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0, n=0; i < length; i++, n++) {
		// 1. �ݺ����� �̿��ؼ� list�� ����� Student��ü�� �ϳ��� �д´�.
		Student4 s = (Student4)list.get(i);
		
		// 1.1 ���� �޶�����,(ban�� prevBan�� �ٸ���)
		// ���� ���(prevRank)�� ���� ����(prevTotal)�� �ʱ�ȭ �Ѵ�.
		if(s.ban!=prevBan) {
		prevRank = -1;
		prevTotal = -1;
		n = 0;
		}
		
		// 1.2 ����(total)�� ��������(prevTotal)�� ������
		// ���� ���(prevRank)�� ���(classRank)�� �Ѵ�.
		if(s.total==prevTotal) {
		s.classRank = prevRank;
		} else {
		// 1.3 ������ ���� �ٸ���,
		// ���(classRank)�� ���� �˸°� ����ؼ� �����Ѵ�.
		// ������ �����ڿ��ٸ�, �� ���� ����� �������� ���� ����ؾ��Ѵ�.
		s.classRank = n + 1;
		}
		// 1.4 ���� �ݰ� ������ ����� ���� ��(prevBan),
		// ���� ����(prevTotal), ���� ���(prevRank)�� �����Ѵ�.
		prevBan = s.ban;
		prevRank = s.classRank;
		prevTotal = s.total;
		}
	} // public static void calculateClassRank(List list) {
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ �����Ѵ�.
		
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		
		for(int i=0;i < length; i++) {
		Student4 s = (Student4)list.get(i);
		
		if(s.total==prevTotal) {
		s.schoolRank = prevRank;
		} else {
		s.schoolRank = i + 1;
		}
		
		prevRank = s.schoolRank;
		prevTotal = s.total;
		} // for
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student4("���ڹ�",2,1,70,90,70));
		list.add(new Student4("���ڹ�",2,2,60,100,80));
		list.add(new Student4("ȫ�浿",1,3,100,100,100));
		list.add(new Student4("���ü�",1,1,90,70,80));
		list.add(new Student4("���ڹ�",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		System.out.println(it.next());
	}

}
