package container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest4 extends JFrame {
	public FrameTest4() {
		
		setTitle("MyFrame");
		setSize(300,300);
		setLayout(new FlowLayout());
		// 프레임을 닫으면 프로그램 종료 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 컴포넌트 : JButton, JCheckBox, JRadio...
		JButton btn1 = new JButton("파");
		add(btn1);
	
		JButton btn2 = new JButton("리");
		add(btn2);

		JButton btn3 = new JButton("바");
		add(btn3);
	
		JButton btn4 = new JButton("게");
		add(btn4);
		
		JButton btn5 = new JButton("트");
		add(btn5);
	
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		FrameTest4 frame = new FrameTest4();
		
		
	}

}
