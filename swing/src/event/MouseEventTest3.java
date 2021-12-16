package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest3 extends JFrame {
	
	private JLabel lbl = new JLabel("HELLO");
	
	
	public MouseEventTest3() {
		setTitle("�ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���� ������ ���̾ƿ� ���ֱ�
		setLayout(null);
		
		// ���̺� ��ġ
		lbl.setLocation(50,50);
		lbl.setSize(100,20);
		add(lbl);
		
		
		// ���̺��� ��Ŀ���� ���� �� �ֵ��� ���� 
		Container contentPane = getContentPane();
		contentPane.addMouseListener(new MyMouseAdapter());
//		contentPane.setFocusable(true);
		// Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
//		contentPane.requestFocus();
		
		setSize(200,200);
		View();
	}
	public void View() {
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventTest3();
	    
	}
	class MyMouseAdapter extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			lbl.setLocation(e.getX(),e.getY());
		}
	}
}
