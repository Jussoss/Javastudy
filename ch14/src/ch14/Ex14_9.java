package ch14;
// [14-9] 다음은 각 반별 총점을 학년 별로 나누어 출력하는 프로그램이다. 
// (1)에 알맞은 코드를 넣어 완성하시오.
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Student11 {
	String name;
	boolean isMale; // 성별
	int hak; // 학년
	int ban; // 반
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
		return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ?
				"남":"여", hak, ban, score);
	}
	enum Level {
		HIGH, MID, LOW
	}
} // class student11

public class Ex14_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student11[] stuArr = {
				new Student11("나자바", true, 1, 1, 300),
				new Student11("김지미", false, 1, 1, 250),
				new Student11("김자바", true, 1, 1, 200),
				new Student11("이지미", false, 1, 2, 150),
				new Student11("남자바", true, 1, 2, 100),
				new Student11("안지미", false, 1, 2, 50),
				new Student11("황지미", false, 1, 3, 100),
				new Student11("강지미", false, 1, 3, 150),
				new Student11("이자바", true, 1, 3, 200),
				
				new Student11("나자바", true, 2, 1, 300),
				new Student11("김지미", false, 2, 1, 250),
				new Student11("김자바", true, 2, 1, 200),
				new Student11("이지미", false, 2, 2, 150),
				new Student11("남자바", true, 2, 2, 100),
				new Student11("안지미", false, 2, 2, 50),
				new Student11("황지미", false, 2, 3, 100),
				new Student11("강지미", false, 2, 3, 150),
				new Student11("이자바", true, 2, 3, 200)
				};
		
				Map<Integer, Map<Integer, Long>> totalScoreByHakAndBan = Stream.of(stuArr)
						
				/* (1) 알맞은 코드를 넣으시오. */
						
					.collect(
						groupingBy(
							Student11::getHak, // 학생의 학년별로 그룹화
							groupingBy(
								Student11::getBan, // 반별로 그룹화
								summingLong(Student11::getScore) // 스코어의 합
							)
						)
					);
				
				for(Object e : totalScoreByHakAndBan.entrySet()) { // 점수의 총합을 가져옴
					System.out.println(e);
				}
	} // main

}
