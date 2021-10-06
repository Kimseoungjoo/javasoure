package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LableChange extends JFrame {
	private JButton btn1,btn2;
	public LableChange()	{
		setTitle("액션이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JLabel lbl = new JLabel("변경된다");
//		lbl.setText("레이블");
		
		btn1 = new JButton("click");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lbl.setText("첫번쨰 클릭");
				
				
				
			}
		});
		add(btn1);
		
		add(lbl);

		btn2 = new JButton("누르지마셈");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("두번째클릭");
			}
		});
		add(btn2);
		
		
		setBounds(100,100,300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LableChange();
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
