package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
// BorderLayout 
// ��, ��, ��, ��, ��
// BorderLayout.EAST
// BorderLayout.WEST
// BorderLayout.SOUTH
// BorderLayout.NORTH
// BorderLayout.CENTER

public class BorderLayoutTest2 extends JFrame {
	public BorderLayoutTest2()	{
		setTitle("BorderLayout �׽�Ʈ");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �⺻ ���̾ƿ� BorderLayout 
		Container container = getContentPane();
		container.setLayout(new BorderLayout(30, 20));
		
		
		JButton btn1 = new JButton("��");
		add(btn1,BorderLayout.WEST);
	
		JButton btn2 = new JButton("��");
		add(btn2,BorderLayout.CENTER);

		JButton btn3 = new JButton("��");
		add(btn3,BorderLayout.EAST);
	
		JButton btn4 = new JButton("��");
		add(btn4,BorderLayout.SOUTH);
		
		JButton btn5 = new JButton("Ʈ");
		add(btn5,BorderLayout.NORTH);
	
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		BorderLayoutTest2 bor = new BorderLayoutTest2();
	}
}
