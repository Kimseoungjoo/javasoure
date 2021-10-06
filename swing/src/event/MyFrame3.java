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
		setTitle("액션이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		btn1 = new JButton("click");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("첫번쨰 버튼 클릭");
				
				
			}
		});
		add(btn1);
		
		
		JLabel lbl = new JLabel("버튼을 누루세요");
		add(lbl);

		btn2 = new JButton("누르지마셈");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("왜 눌러? 왜눌러?");
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
//			System.out.println("버튼이 눌러졌다이말이야");
//		}else if(e.getSource()==btn2) {
//			System.out.println("왜눌러");
//		}
//	
//	}
	
}
