package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* FlowLayout : ������Ʈ�� ���ʿ��� ���������� ��ġ
 * 				������ ������ ������ �Ʒ��� ������
 * 
 */

public class FlowLayoutTest1 extends JFrame {
	public FlowLayoutTest1()	{
		setTitle("BorderLayout �׽�Ʈ");
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �⺻ ���̾ƿ� BorderLayout
		// ���̾ƿ� ����
		// setLayout(new FlowLayout());
	
		
		// ���� �����ӿ� contentPnae ��������
//		Container container = getContentPane();
		// contentPane �� ���ο� ���̾ƿ� ���� 
//		container.setLayout(new FlowLayout());
		
		
//		JPanel panel = new JPanel(); // �⺻ ���̾ƿ��� FlowLayout
//		setContentPane(panel);
		
		
		
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
	
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		FlowLayoutTest1 bor = new FlowLayoutTest1();
	}
}
