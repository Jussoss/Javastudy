package ch12;
// [12-3] 다음 중 올바르지 않은 문장을 모두 고르시오.
public class Ex12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Box6<?> b = new Box6(); // 문제가 되진 않지만 <>를 붙여주는 것이 좋음
		// Box6<?> b = new Box6<>(); // <>를 생략하면 참조변수의 타입과 같은 타입으로 간주됨
		// Box6<?> b = new Box6<Object>(); // 에러. T가 Fruit6의 자손으로 제한되어 있기때문
		// Box6<Object> b = new Box6<Fruit6>(); // 에러. 타입 불일치
		// Box6 b = new Box6<Fruit6>(); // 사용가능하지만 바람직하진 않음
		// Box6<? extends Fruit6> b = new Box6<Apple6>(); // 가능. 가리키는 클래스가 같음
		// Box6<? extends Object> b = new Box6<? extends Fruit6>(); // 에러. new연산자는 타입이 명확해야함
	}

}

class Box6<T extends Fruit6> { // 지네릭 타입 T를 선언
	T item;
	
	void setItem(T item) { this.item = item; }
	T getItem() { return item; }
}

class Fruit6 {}
class Apple6 extends Fruit6 {}