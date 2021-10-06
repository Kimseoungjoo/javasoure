package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
// BorderLayout 
// 상, 하, 좌, 우, 중
// BorderLayout.EAST
// BorderLayout.WEST
// BorderLayout.SOUTH
// BorderLayout.NORTH
// BorderLayout.CENTER

public class BorderLayoutTest1 extends JFrame {
	public BorderLayoutTest1()	{
		setTitle("BorderLayout 테스트");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("파");
		add(btn1,BorderLayout.WEST);
	
		JButton btn2 = new JButton("리");
		add(btn2,BorderLayout.CENTER);

		JButton btn3 = new JButton("바");
		add(btn3,BorderLayout.EAST);
	
		JButton btn4 = new JButton("게");
		add(btn4,BorderLayout.SOUTH);
		
		JButton btn5 = new JButton("트");
		add(btn5,BorderLayout.NORTH);
	
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		BorderLayoutTest1 bor = new BorderLayoutTest1();
	}
}
