package ch13;
// [13-2] ���� �ڵ��� �������� ���� ����?
public class Ex13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1 = new Thread2();
		t1.run(); // Thread2Ŭ������ �޼��� ȣ��
		
		for(int i=0; i < 10; i++) // ������� ���
			System.out.print(i);
	}

}

class Thread2 extends Thread {
	public void run() {
		for(int i=0; i < 10; i++)
			System.out.print(i);
	}
}