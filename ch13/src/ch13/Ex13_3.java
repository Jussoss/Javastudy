package ch13;
import javax.swing.JOptionPane;
// [13-3] 다음 중 쓰레드를 일시정지 상태(WAITING)로 만드는 것이 아닌 것은? (모두 고르시오.)
// a. suspend() 쓰레드 일시정지
// b. resume() suspend로 인해 일시정지한 쓰레드를 실행대기 상태로 만듬
// c. join() 지정된 시간동안 쓰레드 실행
// d. sleep() 지정된 시간동안 쓰레드 일시정지
// e. wait() 쓰레드가 lock을 반납하고 일시정지
// f. notify() wait로 일시정지한 쓰레드를 실행대기 상태로 만듬

public class Ex13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread5 th1 = new Thread5();
		Thread5 th2 = new Thread5();
		Thread5 th3 = new Thread5();
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend(); // 쓰레드 정지
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(2000);
			th1.resume(); // suspend()에 의해 정지된 쓰레드를 실행대기 상태로
			
		} catch (InterruptedException e) {}
		
	} // main
}

class Thread5 extends Thread {
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
} // class Thread5