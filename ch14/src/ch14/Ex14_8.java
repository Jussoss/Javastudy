package ch14;
// [14-8] 다음은 불합격(150점 미만)한 학생의 수를 남자와 여자로 구별하여 출력하는 프로그램이다. 
// (1)에 알맞은 코드를 넣어 완성하시오.
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Student10 {
	String name;
	boolean isMale; // 성별
	int hak; // 학년
	int ban; // 반
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
		return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ?
				"남":"여", hak, ban, score);
	}
	// groupingBy()에서 사용
	enum Level { HIGH, MID, LOW } // 성적을 상, 중, 하 세 단계로 분류
} // class Student10

public class Ex14_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student10[] stuArr = {
				new Student10("나자바", true, 1, 1, 300),
				new Student10("김지미", false, 1, 1, 250),
				new Student10("김자바", true, 1, 1, 200),
				new Student10("이지미", false, 1, 2, 150),
				new Student10("남자바", true, 1, 2, 100),
				new Student10("안지미", false, 1, 2, 50),
				new Student10("황지미", false, 1, 3, 100),
				new Student10("강지미", false, 1, 3, 150),
				new Student10("이자바", true, 1, 3, 200),
				
				new Student10("나자바", true, 2, 1, 300),
				new Student10("김지미", false, 2, 1, 250),
				new Student10("김자바", true, 2, 1, 200),
				new Student10("이지미", false, 2, 2, 150),
				new Student10("남자바", true, 2, 2, 100),
				new Student10("안지미", false, 2, 2, 50),
				new Student10("황지미", false, 2, 3, 100),
				new Student10("강지미", false, 2, 3, 150),
				new Student10("이자바", true, 2, 3, 200)
				};
		Map<Boolean, Map<Boolean, Long>> failedStuBySex = Stream.of(stuArr)
				
				/* (1) 알맞은 코드를 넣으시오. */
				.collect(
					partitioningBy( // true와 false를 비교할 때 사용
							Student10::isMale,
							partitioningBy(s -> s.getScore() < 150, counting())
					)
				);
		
				long failedMaleStuNum = failedStuBySex.get(true).get(true);
				long failedFemaleStuNum = failedStuBySex.get(false).get(true);
				
				System.out.println("불합격[남자]:"+ failedMaleStuNum +"명");
				System.out.println("불합격[여자]:"+ failedFemaleStuNum +"명");
	}
}

