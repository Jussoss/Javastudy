package ch12;

import java.util.ArrayList;
class Fruit5		        { public String toString() { return "Fruit";}}
class Apple5 extends Fruit5 { public String toString() { return "Apple";}}
class Grape5 extends Fruit5 { public String toString() { return "Grape";}}
// [12-2] 지네릭 메서드 makeJuice()가 아래와 같이 정의되어 있을 때, 이 메서드를 올바르게
// 호출한 문장을 모두 고르시오. (Apple과 Grape는 Fruit의 자손이라고 가정하자.)

public class Ex12_2 {
	public static void main(String[] args) {
		// 문제 부분
		// Juicer5.<Apple5>makeJuice5(new FruitBox5<Fruit5>()); // 타입 불일치
		// Juicer5.<Fruit5>makeJuice5(new FruitBox5<Grape5>()); // 타입 불일치
		Juicer5.<Fruit5>makeJuice5(new FruitBox5<Fruit5>());
		Juicer5.makeJuice5(new FruitBox5<Apple5>());
		// Juicer5.makeJuice5(new FruitBox5<Object5>()); // 타입은 일치하나 <T extends Fruit>로 제한이 걸려있으므로 에러.
	}
}

class Juicer5 {
	static <T extends Fruit5> String makeJuice5(FruitBox5<T> box) {
		String tmp = "";
		
		for(Fruit5 f : box.getList()) // box에 있는 List들을 꺼내서 f에 담음
			tmp += f + " "; // 문자열 결합
		return tmp; // ArrayList<T> 반환
		}
}

class FruitBox5<T extends Fruit5> extends Box5<T> {}

class Box5<T> { //class FruitBox5<T extends Fruit5>의 자손
		ArrayList<T> list = new ArrayList<T>();
		ArrayList<T> getList() { return list;  } // getList 반환
}


