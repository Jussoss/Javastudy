package ch11;
// [11-5] 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서
// 이름(name)이 기본 정렬기준이 되도록 하시오.
import java.util.*;

class Student implements Comparable  { // 기본 정렬기준 구현
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
	
	// 문제 부분
	public int compareTo(Object o) { 
		if(o instanceof Student) { // 형변환
			Student tmp = (Student)o;
			return name.compareTo(tmp.name); // String클래스의 compareTo()를 호출 
		} else {
			return -1; // 정렬 대상이 아니면 음수 값 반환 
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
		list.add(new Student("홍길동",1,1,100,100,100));
		list.add(new Student("남궁성",1,2,90,70,80));
		list.add(new Student("김자바",1,3,80,80,90));
		list.add(new Student("이자바",1,4,70,90,70));
		list.add(new Student("안자바",1,5,60,100,80));
		
		Collections.sort(list); // list에 저장된 요소들을 정렬한다.(compareTo()호출) comparable로 정렬기준 구현
		Iterator it = list.iterator();
		
		while(it.hasNext()) // 읽어올 요소 확인
			System.out.println(it.next()); // 호출
	}
}
