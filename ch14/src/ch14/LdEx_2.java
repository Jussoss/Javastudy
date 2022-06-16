package ch14;
import java.util.function.Function;
import java.util.function.Supplier;

public class LdEx_2 {

	public static void main(String[] args) {
// 		Supplier는 입력X, 출력O
// 		Supplier<MyClass> f = () -> new MyClass();
// 		Supplier<MyClass> f = MyClass::new; // 메서드 참조. 클래스이름::메서드이름
		
		
//		생성자와 메서드 참조
		Function<Integer, MyClass> f = (i) -> new MyClass(i); // 람다식
// 		Function<Integer, MyClass> f = MyClass::new; // 메서드참조. 클래스이름::메서드이름
	
		
		MyClass mc = f.apply(100);
		System.out.println(mc.iv); // 100
		System.out.println(f.apply(200).iv); // 200. 위의 출력 값을 한 줄로
		
// 		배열과 메서드 참조
		Function<Integer, int[]> f2 = (i) -> new int[i]; // 람다식
//		Function<Integer, int[]> f2 = int[]::new; // 메서드 참조. 배열타입::new
		int [] arr = f2.apply(100);
		
		System.out.println("arr.length="+arr.length); // 100
		
	}

}

class MyClass {
	int iv;
	
	MyClass(int iv) {
		this.iv = iv;
	}
}