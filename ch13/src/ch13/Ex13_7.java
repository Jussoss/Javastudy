package ch13;
// [13-7] 다음의 코드는 쓰레드 th1을 생성해서 실행시킨 다음 6초 후에 정지시키는 코드이다.
// 그러나 실제로 실행시켜보면 쓰레드를 정지시킨 다음에도 몇 초가 지난 후에서야 멈춘다.
// 그 이유를 설명하고, 쓰레드를 정지시키면 바로 정지되도록 코드를 개선하시오.
public class Ex13_7 {
	static boolean stopped = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread6 th1 = new Thread6();
		th1.start();
		
		try {
			Thread.sleep(6*1000);
			} catch(Exception e) {}
			stopped = true; // 쓰레드를 정지시킨다.
			th1.interrupt(); // 일시정지 상태에 있는 쓰레드를 깨운다.
			System.out.println("stopped");
	}

}

class Thread6 extends Thread {
	public void run() {
		// Ex13_7.stopped의 값이 false인 동안 반복한다.
		for(int i=0; !Ex13_7.stopped; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3*1000); // 3초간 쉼
			} catch(Exception e) {}
		}
	} // run()
}

// Ex13_7.stopped의 값이 바뀌어도 for문내의 Thread.sleep(3*1000);문장에
// 의해 일시정지 상태에 있는 경우, 시간이 지나서 일시정지 상태를 벗어날 때까지 for문을
// 벗어날 수 없기 때문에 이런 현상이 발생한다.