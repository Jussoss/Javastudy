class Data3 { int x; }

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조형 반환타입 예제
		Data3 d = new Data3(); 		// 1. main메서드에 객체 Data3 d 생성
		d.x = 10; 					// 2. d에 있는 x값을 10으로 저장
		
		Data3 d2 = copy(d);			// 3. main메서드에 객체 Data3 d2가 만들어짐 = copy메서드에 (main메서드 d 값을 복사)
									// 8. 반환한 tmp값이 main메서드 d2객체에 대입 됨  ※d2는 새로운 Data3()를 가리키게 됨
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
	}

	static Data3 copy(Data3 d) {	// 4. copy메서드에 (Data3타입 참조형d가 만들어짐)
		Data3 tmp = new Data3();	// 5. copy메서드에 객체 tmp 생성 = 새로운 Data3() 생성
		
		tmp.x = d.x;				// 6. copy의 지역변수 d.x값을 tmp.x에 저장
		
		return tmp;					// 7. 반환타입이 참조형Data3일 때 객체의 주소를 반환함
	}
}
