package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {
	private JButton rock, scissor, paper;
	private JTextField textField;
//	static final int ROCK = 0;
//	static final int SCISSOR = 1;
//	static final int PAPER = 2;

	public RockScissorPaper() {
		setTitle("���� ���� ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���� contentPane ��������
		Container contentPane =  getContentPane();
		
		// ��ܸ޼���
		JLabel label = new JLabel("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�");
		label.setFont(new Font("����", Font.BOLD, 18));
		contentPane.add(label,BorderLayout.NORTH);// add(label,BorderLayout.NORTH);
		
		// ��� �̹��� ���
		// JPanel �� center�� ���� => JPNEL�� GRIDLAYOUT ���� => ��ư 3�� ����
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(0, 3));
		
		rock = new JButton();
		scissor = new JButton();
		paper = new JButton();
		
		// ������ ��������
		rock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/rock.png")));
		scissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/scissor.png")));
		paper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/paper.png")));
		
		// �׼� �ֱ� 
		rock.setActionCommand("0");
		scissor.setActionCommand("1");
		paper.setActionCommand("2");
		rock.addActionListener(this);
		scissor.addActionListener(this);
		paper.addActionListener(this);
		
		contentPane.add(panel1,BorderLayout.CENTER);
		panel1.add(rock);
		panel1.add(scissor);
		panel1.add(paper);
		
		// �ϴ� ��� ���
		textField = new JTextField();
		textField.setFont(new Font("����",Font.BOLD,18));
		contentPane.add(textField,BorderLayout.SOUTH);
		
		
		setBounds(200, 200, 450, 450);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new RockScissorPaper();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// �����ڰ� ���� ����, ����, �� ��������
		int user = Integer.parseInt(e.getActionCommand());
		String com;
		// ��ǻ���� ����, ����, �� ���� 
		int i = (int)(Math.random()*3);
		switch (i) {
		case 0:
			com = "����";
			break;
		case 1:
			com = "����";
			break;

		default:
			com = "��";
			break;
		}
		// ��ǻ�Ϳ� user ���̿��� ���� �̰���� ���
		
		int result = user-i;
		switch (result) {
		case -2: // ���� �� ����ڿ� ��ǻ���� ���� �� 
		case 1:
			textField.setText("��ǻ�� "+com+": �����ϴ�");
			break;
		case -1: // �̰��� �� ����ڿ� ��ǻ���� ���� �� 
		case  2:
			textField.setText("��ǻ�� "+com+": �̰���ϴ�");
			break;
		default:
			textField.setText("��ǻ�� "+com+": ���");
			break;
		}
		
		
	}

}
