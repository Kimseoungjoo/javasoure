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
		// ������Ʈ : JButton, JCheckBox, JRadio...
		JButton btn1 = new JButton("��ư");
		add(btn1,BorderLayout.EAST);
	
		JButton btn2 = new JButton("��ư");
		add(btn2,BorderLayout.SOUTH);

		JButton btn3 = new JButton("��ư");
		add(btn3,BorderLayout.WEST);
	
		JButton btn4 = new JButton("��ư");
		add(btn4,BorderLayout.NORTH);
		
		JButton btn5 = new JButton("��ư");
		add(btn5,BorderLayout.CENTER);
	
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		FrameTest3 frame = new FrameTest3();
		
		
	}

}
