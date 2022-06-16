package ch13;

// [13-5] 다음의 코드를 실행한 결과를 예측하고, 직접 실행한 결과와 비교하라. 
// 만일 예측한 결과와 실행한 결과의 차이가 있다면 그 이유를 설명하라.

public class Ex13_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread3 th1 = new Thread3();
		th1.start();
		
		try {
			Thread.sleep(5*1000); // main쓰레드를 5초간 정지시킨다.
		} catch(Exception e) {}
		
		throw new Exception("꽝~!!!");
	}
} // class Ex13_5

	class Thread3 extends Thread {
		public void run() {
			for(int i=0; i < 10; i++) {
				System.out.println(i);
			
				try {
					Thread.sleep(1000);
				} catch(Exception e) {}
			}
		} // run()
	} // class Thread3
	
	// main과 th1 두 개의 쓰레드는 별도의 호출스택에서 실행 됨
	// main에서 Exception이 발생하여 호출스택이 없어져도 th1에 영향 없음

