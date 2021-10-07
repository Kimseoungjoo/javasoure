package event;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventTest2 extends JFrame {
	public MouseEventTest2() {
		
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("클릭");
		add(btn,BorderLayout.NORTH);
		btn.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX()+" "+e.getY()+" "+e.getClickCount());
				
			}
			
			
			
			
		});
		
		
		
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventTest2();
	}

}
