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
		// �������� ������ ���α׷� ���� 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ������Ʈ : JButton, JCheckBox, JRadio...
		JButton btn1 = new JButton("��");
		add(btn1);
	
		JButton btn2 = new JButton("��");
		add(btn2);

		JButton btn3 = new JButton("��");
		add(btn3);
	
		JButton btn4 = new JButton("��");
		add(btn4);
		
		JButton btn5 = new JButton("Ʈ");
		add(btn5);
	
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		FrameTest4 frame = new FrameTest4();
		
		
	}

}
