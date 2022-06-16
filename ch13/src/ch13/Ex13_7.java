package ch13;
// [13-7] ������ �ڵ�� ������ th1�� �����ؼ� �����Ų ���� 6�� �Ŀ� ������Ű�� �ڵ��̴�.
// �׷��� ������ ������Ѻ��� �����带 ������Ų �������� �� �ʰ� ���� �Ŀ����� �����.
// �� ������ �����ϰ�, �����带 ������Ű�� �ٷ� �����ǵ��� �ڵ带 �����Ͻÿ�.
public class Ex13_7 {
	static boolean stopped = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread6 th1 = new Thread6();
		th1.start();
		
		try {
			Thread.sleep(6*1000);
			} catch(Exception e) {}
			stopped = true; // �����带 ������Ų��.
			th1.interrupt(); // �Ͻ����� ���¿� �ִ� �����带 �����.
			System.out.println("stopped");
	}

}

class Thread6 extends Thread {
	public void run() {
		// Ex13_7.stopped�� ���� false�� ���� �ݺ��Ѵ�.
		for(int i=0; !Ex13_7.stopped; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3*1000); // 3�ʰ� ��
			} catch(Exception e) {}
		}
	} // run()
}

// Ex13_7.stopped�� ���� �ٲ� for������ Thread.sleep(3*1000);���忡
// ���� �Ͻ����� ���¿� �ִ� ���, �ð��� ������ �Ͻ����� ���¸� ��� ������ for����
// ��� �� ���� ������ �̷� ������ �߻��Ѵ�.