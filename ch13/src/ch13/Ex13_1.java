package ch13;
// [13-1] �����带 �����ϴ� ������� ThreadŬ�����κ��� ��ӹ޴� �Ͱ� Runnable�������̽���
// �����ϴ� �� �� ������ �ִµ�, ������ �ڵ�� ThreadŬ������ ��ӹ޾Ƽ� �����带
// ������ ���̴�. �� �ڵ带 Runnable�������̽��� �����ϵ��� �����Ͻÿ�.
/*public class Ex13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th1 = new Thread1();
		
		th1.start();
	}

}

class Thread1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print('-');
		}
	}
}*/

class Ex13_1 {
	public static void main(String args[]) {
		Thread th1 = new Thread(new Thread1()); // Runnable�� ������ Ŭ������ �ν��Ͻ� ����

		th1.start();
	}
}

class Thread1 implements Runnable {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print('-');
		}
	}
}
