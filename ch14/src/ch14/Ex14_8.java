package ch14;
// [14-8] ������ ���հ�(150�� �̸�)�� �л��� ���� ���ڿ� ���ڷ� �����Ͽ� ����ϴ� ���α׷��̴�. 
// (1)�� �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Student10 {
	String name;
	boolean isMale; // ����
	int hak; // �г�
	int ban; // ��
	int score;
	
	Student10(String name, boolean isMale, int hak, int ban, int score) {
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
	// groupingBy()���� ���
	enum Level { HIGH, MID, LOW } // ������ ��, ��, �� �� �ܰ�� �з�
} // class Student10

public class Ex14_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student10[] stuArr = {
				new Student10("���ڹ�", true, 1, 1, 300),
				new Student10("������", false, 1, 1, 250),
				new Student10("���ڹ�", true, 1, 1, 200),
				new Student10("������", false, 1, 2, 150),
				new Student10("���ڹ�", true, 1, 2, 100),
				new Student10("������", false, 1, 2, 50),
				new Student10("Ȳ����", false, 1, 3, 100),
				new Student10("������", false, 1, 3, 150),
				new Student10("���ڹ�", true, 1, 3, 200),
				
				new Student10("���ڹ�", true, 2, 1, 300),
				new Student10("������", false, 2, 1, 250),
				new Student10("���ڹ�", true, 2, 1, 200),
				new Student10("������", false, 2, 2, 150),
				new Student10("���ڹ�", true, 2, 2, 100),
				new Student10("������", false, 2, 2, 50),
				new Student10("Ȳ����", false, 2, 3, 100),
				new Student10("������", false, 2, 3, 150),
				new Student10("���ڹ�", true, 2, 3, 200)
				};
		Map<Boolean, Map<Boolean, Long>> failedStuBySex = Stream.of(stuArr)
				
				/* (1) �˸��� �ڵ带 �����ÿ�. */
				.collect(
					partitioningBy( // true�� false�� ���� �� ���
							Student10::isMale,
							partitioningBy(s -> s.getScore() < 150, counting())
					)
				);
		
				long failedMaleStuNum = failedStuBySex.get(true).get(true);
				long failedFemaleStuNum = failedStuBySex.get(false).get(true);
				
				System.out.println("���հ�[����]:"+ failedMaleStuNum +"��");
				System.out.println("���հ�[����]:"+ failedFemaleStuNum +"��");
	}
}

