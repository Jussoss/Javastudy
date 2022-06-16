package ch13;
// [13-2] 다음 코드의 실행결과로 옳은 것은?
public class Ex13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1 = new Thread2();
		t1.run(); // Thread2클래스의 메서드 호출
		
		for(int i=0; i < 10; i++) // 순서대로 출력
			System.out.print(i);
	}

}

class Thread2 extends Thread {
	public void run() {
		for(int i=0; i < 10; i++)
			System.out.print(i);
	}
}