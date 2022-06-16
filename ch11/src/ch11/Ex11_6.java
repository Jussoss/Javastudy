package ch11;
// [11-6] ������ �ڵ�� ��������� �������� �л� ���� ���� ���� ���̴�. TreeSet�� �л�����
// ����� �������� �����ϵ��� compare(Object o1, Object o2)�� ��������� ������ �ָ�
// �ش� ������ ���� �л��� ���� ��ȯ�ϴ� getGroupCount()�� �ϼ��϶�.
// [Hint] TreeSet�� subSet(Object from, Object to)�� ����϶�.
import java.util.*;

class Student1 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student1(String name, int ban, int no, int kor, int eng, int math) {
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

	public int compareTo(Object o) {
		if(o instanceof Student1) {
			Student1 tmp = (Student1)o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
} // class Student

public class Ex11_6 {
	static int getGroupCount(TreeSet tset, int from, int to) {
		// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		Student1 s1 = new Student1("",0,0,from,from,from);
		Student1 s2 = new Student1("",0,0,to,to,to);
		
		return tset.subSet(s1,s2).size(); 
		// TreeSetŬ������ subSet()�� ������ ������ ���ϴ� ��ҵ��� ���Ե� TreeSet�� ��ȯ�Ѵ�.
		}
	
	public static void main(String[] args) { // ���� ������ ���� Ŭ�����̱� ������ TreeSet(Comparator c)�� �̿��ؼ� ���ı��� ����
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet(new Comparator() {  // Comparator�������̽��� ������ �͸�Ŭ���� �ۼ�
			public int compare(Object o1, Object o2) { // �־��� �� ��ü�� ��
			//(2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			if(o1 instanceof Student1 && o2 instanceof Student1) {
			Student1 s1 = (Student1)o1;
			Student1 s2 = (Student1)o2;
				return (int)(s1.getAverage() - s2.getAverage());
				}
				return -1;
			}
		});
		
		set.add(new Student1("���ü�",1,2,90,70,80));
		set.add(new Student1("���ڹ�",1,3,80,80,90));
		set.add(new Student1("���ڹ�",1,4,70,90,70));
		set.add(new Student1("���ڹ�",1,5,60,100,80));
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("[60~69] :"+getGroupCount(set,60,70));
		System.out.println("[70~79] :"+getGroupCount(set,70,80));
		System.out.println("[80~89] :"+getGroupCount(set,80,90));
		System.out.println("[90~100] :"+getGroupCount(set,90,101));
	}
} // Ex11_6
