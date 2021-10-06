package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame implements ActionListener{
	private JLabel lbl;
	private JButton btn1,btn2;
	public MyFrame2()	{
		setTitle("액션이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		btn1 = new JButton("click");
		btn1.addActionListener(this);
		add(btn1);
		
		lbl = new JLabel("변화레이블");
		add(lbl);

		btn2 = new JButton("누르지마셈");
		btn2.addActionListener(this);
		add(btn2);
		
		
		setBounds(100,100,300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("e.getActionCommand() "+e.getActionCommand());
//		System.out.println("e.getID() "+e.getID());
//		System.out.println("e.getSource() "+e.getSource());
		if(e.getSource()==btn1) {
			lbl.setText("첫번쨰");
		}else if(e.getSource()==btn2) {
			lbl.setText("두번쨰");
		}
	
	}
	
}
