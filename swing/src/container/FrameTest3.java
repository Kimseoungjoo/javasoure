package container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest3 extends JFrame {
	public FrameTest3() {
		
		setTitle("MyFrame");
		setSize(300,300);
		// 컴포넌트 : JButton, JCheckBox, JRadio...
		JButton btn1 = new JButton("버튼");
		add(btn1,BorderLayout.EAST);
	
		JButton btn2 = new JButton("버튼");
		add(btn2,BorderLayout.SOUTH);

		JButton btn3 = new JButton("버튼");
		add(btn3,BorderLayout.WEST);
	
		JButton btn4 = new JButton("버튼");
		add(btn4,BorderLayout.NORTH);
		
		JButton btn5 = new JButton("버튼");
		add(btn5,BorderLayout.CENTER);
	
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		FrameTest3 frame = new FrameTest3();
		
		
	}

}
