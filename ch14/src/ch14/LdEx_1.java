package ch14;

public class LdEx_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object obj = (a, b) -> a > b ? a : b; // 람다식. 익명객체
		// MyFunction2 f = new MyFunction2() {
		//	 public int max(int a, int b) { // public사용. 오버라이딩 - 접근제어자는 좁게 못바꾼다.
		//		return a > b ? a : b; // a와 b를 비교했을 때 큰 값을 반환
		//	 }
		// };
		
		// 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		MyFunction2 f = (a, b) -> a > b ? a : b; // 람다식. 익명객체
		
		int value = f.max(3,5); // 함수형 인터페이스
								// 추상 메서드 max를 통해 람다식을 호출함
		System.out.println("value="+value);
	}

}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
interface MyFunction2 {
	// public abstract int max2(int a, int b);
	int max(int a, int b);
	// public abstract 생략 가능
}





// @FunctionalInterface
// interface TriFunction<T,U,V,R> {
// 		R apply(T t, U u, V v);
// }









