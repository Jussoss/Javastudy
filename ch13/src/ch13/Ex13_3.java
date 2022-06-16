package ch13;
import javax.swing.JOptionPane;
// [13-3] ���� �� �����带 �Ͻ����� ����(WAITING)�� ����� ���� �ƴ� ����? (��� ���ÿ�.)
// a. suspend() ������ �Ͻ�����
// b. resume() suspend�� ���� �Ͻ������� �����带 ������ ���·� ����
// c. join() ������ �ð����� ������ ����
// d. sleep() ������ �ð����� ������ �Ͻ�����
// e. wait() �����尡 lock�� �ݳ��ϰ� �Ͻ�����
// f. notify() wait�� �Ͻ������� �����带 ������ ���·� ����

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
			th1.suspend(); // ������ ����
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(2000);
			th1.resume(); // suspend()�� ���� ������ �����带 ������ ���·�
			
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