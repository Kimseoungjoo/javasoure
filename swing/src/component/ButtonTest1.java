package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonTest1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton left,right,middle;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest1 frame = new ButtonTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		left = new JButton("Disable miidle Button");
		left.setActionCommand("disable");
		left.addActionListener(this);
		left.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/left.gif")));
		left.setMnemonic('D');
		contentPane.add(left);
		
		middle= new JButton("Middle Button");
		middle.setActionCommand("middle");
		middle.addActionListener(this);
		middle.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/middle.gif")));
		middle.setMnemonic('M');
		contentPane.add(middle);
		
		right = new JButton("Enable middle Button");
		right.setActionCommand("enable");
		right.addActionListener(this);
		
		right.setMnemonic('E');
		right.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/right.gif")));
		contentPane.add(right);
		
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		// disable 버튼 클릭이 되면
		if(cmd.equals("disable")) {
			// disable 버튼 비활성화
			left.setEnabled(false);
			// middle 버튼 비활성화
			middle.setEnabled(false);
			// enable 버튼 활성화
			right.setEnabled(true);
		}else if(cmd.equals("enable")) {
			// enable 버튼 클릭
			// disable 버튼 활성화
			left.setEnabled(true);
			// middle 버튼 활성화
			middle.setEnabled(true);
			// enable 버튼 비활성화
			right.setEnabled(false);
		}else {
			JOptionPane.showMessageDialog(getParent(), "눌러버림");
		}
		
		
	}

}
