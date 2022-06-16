/*아래의 EventHandler를 익명 클래스(anonymous class)로 변경하시오.*/

import java.awt.*;
import java.awt.event.*;

public class Ex_7_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		f.addWindowListener(new EventHandler());
		} // main
	}

	class EventHandler extends WindowAdapter
	{
	public void windowClosing(WindowEvent e) {
	e.getWindow().setVisible(false);
	e.getWindow().dispose();
	System.exit(0);
	}	 
}
	
/*	정답
 * f.addWindowListener(new WindowAdapter() { 조상클래스 이름의 익명 클래스 생성
 * 		public void windowClosing(WindowEvent e) { 
 * 			e.getWindow().setVisible(false);
 * 			e.getWindow().dispose(); 
 * 			System.exit(0); 
 * 			} 
 * 		}); 
 * 	} // main
 */