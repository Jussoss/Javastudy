/*�Ʒ��� EventHandler�� �͸� Ŭ����(anonymous class)�� �����Ͻÿ�.*/

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
	
/*	����
 * f.addWindowListener(new WindowAdapter() { ����Ŭ���� �̸��� �͸� Ŭ���� ����
 * 		public void windowClosing(WindowEvent e) { 
 * 			e.getWindow().setVisible(false);
 * 			e.getWindow().dispose(); 
 * 			System.exit(0); 
 * 			} 
 * 		}); 
 * 	} // main
 */