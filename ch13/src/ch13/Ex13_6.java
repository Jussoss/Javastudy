package ch13;

// [13-6] ������ �ڵ带 ������ ����� �����ϰ�, ���� ������ ����� ���϶�.
// ���� ������ ����� ������ ����� ���̰� �ִٸ� �� ������ �����϶�.

public class Ex13_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread4 th1 = new Thread4();
		th1.setDaemon(true); // ������ th1�� ���󾲷���� �����Ѵ�.
		th1.start();
		
		try {
			th1.sleep(5*1000);
		} catch(Exception e) {}
		
		throw new Exception("��~!!!");
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

// ���� ������� �Ϲ� �����尡 ��� ����Ǹ� �ڵ� ����ǹǷ�
// main������(�Ϲݾ�����)�� ����ʰ� ���ÿ� �ڵ� �����

