package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class KeyPad2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton[] btn = new JButton[9]; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyPad2 frame = new KeyPad2();
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
	public KeyPad2() {
		setTitle("KeyPad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(42);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 5, 5));
		
		// 패널에 버튼 9개 부착
		for(int i = 0; i<btn.length; i++) {
			btn[i] = new JButton((i+1)+"");
			// 버튼 font 변경 
			btn[i].setFont(new Font("굴림",Font.PLAIN,24));
			// 액션리스너
			btn[i].addActionListener(this);
			panel_1.add(btn[i]);
		}
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
