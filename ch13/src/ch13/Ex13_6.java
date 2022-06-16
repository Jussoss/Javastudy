package ch13;

// [13-6] 다음의 코드를 실행한 결과를 예측하고, 직접 실행한 결과와 비교하라.
// 만일 예측한 결과와 실행한 결과의 차이가 있다면 그 이유를 설명하라.

public class Ex13_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread4 th1 = new Thread4();
		th1.setDaemon(true); // 쓰레드 th1을 데몬쓰레드로 설정한다.
		th1.start();
		
		try {
			th1.sleep(5*1000);
		} catch(Exception e) {}
		
		throw new Exception("꽝~!!!");
	}

}

class Thread4 extends Thread {
	public void run() {
		for(int i=0; i < 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	} // run()
}

// 데몬 쓰레드는 일반 쓰레드가 모두 종료되면 자동 종료되므로
// main쓰레드(일반쓰레드)가 종료됨과 동시에 자동 종료됨

