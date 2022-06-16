package ch12;
// [12-1] 클래스 Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은?
// 경고가 발생하는 문장은?
public class Ex12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 부분
		// Box1<Object> b = new Box1<String>(); // 에러. 대입된 타입이 반드시 같아야 한다.
		// Box1<Object> b = (Object)new Box1<String>(); // 에러. Object타입을 Box<Object>타입의 참조변수에 저장불가.(타입 불일치)
		// new Box1<String>().setItem(new Object()); // 에러. 대입된 타입이 String이므로, setItem(T item)의 매개변수 역시, String타입만 허용된다.
		new Box1<String>().setItem("ABC"); // 대입된 타입인 String과 일치하는 타입을 매개변수로 지정했기 때문에 OK.
	}

}

class Box1<T> { // 지네릭 타입 T를 선언
	T item;
	
	void setItem(T item) { this.item = item; }
	T getItem() { return item; }
}