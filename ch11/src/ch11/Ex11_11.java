package ch11;
// [11-11] 다음은 SutdaCard클래스를 HashSet에 저장하고 출력하는 예제이다. HashSet에
// 중복된 카드가 저장되지 않도록 SutdaCard의 hashCode()를 알맞게 오버라이딩하시오.
// [Hint] String클래스의 hashCode()를 사용하라.
import java.util.*;

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return num==c.num && isKwang==c.isKwang;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
	
	// 문제부분
	public int hashCode() {
		return toString().hashCode(); // String클래스의 hashCode()를 호출한다.
		}
	// SutdaCard의 toString()이 num과 isKwang의 값으로 문자열을 만들어 반환하기 때문에,
	// toString()을 호출한 결과에 hashCode()를 호출함으로써 SutdaCard의 hashCode()를 구현함.
}
public class Ex11_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		SutdaCard c3 = new SutdaCard(1,true);
		
		HashSet set = new HashSet();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
	}

}
