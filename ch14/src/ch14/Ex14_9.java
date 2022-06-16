package ch14;
// [14-9] ������ �� �ݺ� ������ �г� ���� ������ ����ϴ� ���α׷��̴�. 
// (1)�� �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Student11 {
	String name;
	boolean isMale; // ����
	int hak; // �г�
	int ban; // ��
	int score;
	
	Student11(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak= hak;
		this.ban= ban;
		this.score = score;
	}
	
	String getName() { return name;}
	boolean isMale() { return isMale;}
	int getHak() { return hak;}
	int getBan() { return ban;}
	int getScore() { return score;}
	
	public String toString() {
		return String.format("[%s, %s, %d�г� %d��, %3d��]", name, isMale ?
				"��":"��", hak, ban, score);
	}
	enum Level {
		HIGH, MID, LOW
	}
} // class student11

public class Ex14_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student11[] stuArr = {
				new Student11("���ڹ�", true, 1, 1, 300),
				new Student11("������", false, 1, 1, 250),
				new Student11("���ڹ�", true, 1, 1, 200),
				new Student11("������", false, 1, 2, 150),
				new Student11("���ڹ�", true, 1, 2, 100),
				new Student11("������", false, 1, 2, 50),
				new Student11("Ȳ����", false, 1, 3, 100),
				new Student11("������", false, 1, 3, 150),
				new Student11("���ڹ�", true, 1, 3, 200),
				
				new Student11("���ڹ�", true, 2, 1, 300),
				new Student11("������", false, 2, 1, 250),
				new Student11("���ڹ�", true, 2, 1, 200),
				new Student11("������", false, 2, 2, 150),
				new Student11("���ڹ�", true, 2, 2, 100),
				new Student11("������", false, 2, 2, 50),
				new Student11("Ȳ����", false, 2, 3, 100),
				new Student11("������", false, 2, 3, 150),
				new Student11("���ڹ�", true, 2, 3, 200)
				};
		
				Map<Integer, Map<Integer, Long>> totalScoreByHakAndBan = Stream.of(stuArr)
						
				/* (1) �˸��� �ڵ带 �����ÿ�. */
						
					.collect(
						groupingBy(
							Student11::getHak, // �л��� �г⺰�� �׷�ȭ
							groupingBy(
								Student11::getBan, // �ݺ��� �׷�ȭ
								summingLong(Student11::getScore) // ���ھ��� ��
							)
						)
					);
				
				for(Object e : totalScoreByHakAndBan.entrySet()) { // ������ ������ ������
					System.out.println(e);
				}
	} // main

}
