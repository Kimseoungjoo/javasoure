package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame3 extends JFrame {
	private JButton btn1,btn2;
	public MyFrame3()	{
		setTitle("�׼��̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		btn1 = new JButton("click");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ù���� ��ư Ŭ��");
				
				
			}
		});
		add(btn1);
		
		
		JLabel lbl = new JLabel("��ư�� ���缼��");
		add(lbl);

		btn2 = new JButton("����������");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�� ����? �ִ���?");
			}
		});
		add(btn2);
		
		
		setBounds(100,100,300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame3();
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
////		System.out.println("e.getActionCommand() "+e.getActionCommand());
////		System.out.println("e.getID() "+e.getID());
////		System.out.println("e.getSource() "+e.getSource());
//		if(e.getSource()==btn1) {
//			System.out.println("��ư�� ���������̸��̾�");
//		}else if(e.getSource()==btn2) {
//			System.out.println("�ִ���");
//		}
//	
//	}
	
}
