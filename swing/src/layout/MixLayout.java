package layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixLayout extends JFrame {
	public MixLayout() {
		setTitle("여러 레이아웃 혼합");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel(); // 기본 FlowLayout 
		panel1.setBackground(Color.orange);
		
		
		panel1.add(new JButton("버튼1"));
		panel1.add(new JButton("버튼2"));
		panel1.add(new JButton("버튼3"));
	
		add(panel1,BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		
		add(panel2,BorderLayout.CENTER);
		
		JButton btn4 = new JButton("swing");
		btn4.setBackground(Color.CYAN);
		panel2.add(btn4);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MixLayout();
	}
}
