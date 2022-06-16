package ch13;
// [13-9] ������ ������� �Է��� ����ϰ� �����ϴ� ���α׷��� �ۼ��� ������, 10�� ����
// �Է��� ������ �ڵ�����Ǿ�� �Ѵ�. �׷��� �������� ����, ������� �Է��� 10�� �ȿ�
// �̷���������� �ұ��ϰ� ���α׷��� ��� ������� �ʴ´�.
// ����ڷκ��� �Է¹޴� ��� ���α׷��� ����ǵ��� �����Ͻÿ�.
import javax.swing.JOptionPane;

class Ex13_9 {
	public static void main(String[] args) throws Exception {
		Ex13_9_1 th1 = new Ex13_9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt(); // �����忡�� �۾��� ���߶�� ��û�Ѵ�.
	}
}

class Ex13_9_1 extends Thread {
	public void run() {
		int i = 10;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000); // 1�� ����
			} catch(InterruptedException e) {
				interrupt(); // �߰�. �������� interrupted���¸� true�� �ٽ� �ٲ���� ��
			}
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}

// sleep()�� ���� �����尡 ��� �������� ��, interrupt()�� ȣ���ϸ� InterruptedException��
// �߻��ǰ� �������� interrupted���´� false�� �ڵ� �ʱ�ȭ�ȴ�.
