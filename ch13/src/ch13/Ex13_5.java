package ch13;

// [13-5] ������ �ڵ带 ������ ����� �����ϰ�, ���� ������ ����� ���϶�. 
// ���� ������ ����� ������ ����� ���̰� �ִٸ� �� ������ �����϶�.

public class Ex13_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread3 th1 = new Thread3();
		th1.start();
		
		try {
			Thread.sleep(5*1000); // main�����带 5�ʰ� ������Ų��.
		} catch(Exception e) {}
		
		throw new Exception("��~!!!");
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
	
	// main�� th1 �� ���� ������� ������ ȣ�⽺�ÿ��� ���� ��
	// main���� Exception�� �߻��Ͽ� ȣ�⽺���� �������� th1�� ���� ����

