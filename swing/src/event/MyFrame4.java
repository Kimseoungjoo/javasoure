package event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame implements ActionListener {
	Container container;
	public MyFrame4() {
		setTitle("프레임 배경색 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임의 레이아웃 변경
		container= getContentPane();
		container.setLayout(new FlowLayout());
		container.setBackground(Color.CYAN);
		
		// 버튼 두개 생성
		JButton btn1 = new JButton("노랑");
		btn1.addActionListener(this);
		
		
	    JButton	btn2 = new JButton("빨강");
		btn2.addActionListener(this);
		
		add(btn1);
		add(btn2);
		
		setBounds(200,200,300,200);
		setVisible(true);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new MyFrame4();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd == "노랑") {
			container.setBackground(Color.YELLOW);
			
		}else {
			container.setBackground(Color.RED);
			
		}
//			container.setBackground(Color.YELLOW);
//		if(e.getSource()==btn1) {
//		}else if(e.getSource()==btn2) {
//			container.setBackground(Color.PINK);
//			
//		}
		
		
		
	}

}
