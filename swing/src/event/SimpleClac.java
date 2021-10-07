package event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SimpleClac extends JFrame implements ActionListener {
	private JTextField num1, num2, result;

	public SimpleClac() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��� ���� �г� ����
		JPanel top = new JPanel();

		// ���ڸ� �Է��ϰ� ����� ����� �ؽ�Ʈ�ʵ� ����
		num1 = new JTextField(10);
		top.add(num1);

		JLabel op = new JLabel("+");
		top.add(op);

		num2 = new JTextField(10);
		top.add(num2);

		JLabel op2 = new JLabel("=");
		top.add(op2);
		result = new JTextField(10);
		top.add(result);

		JPanel bottom = new JPanel();
		JButton btnOk = new JButton("Ȯ��");
		JButton btnReset = new JButton("���");
		btnOk.addActionListener(this);
		btnReset.addActionListener(this);

		bottom.add(btnOk);
		bottom.add(btnReset);

		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.CENTER);

//		JPanel panel1 = new JPanel();
//		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
//		panel1.setLayout(new BorderLayout(0,0));
//		
//		JTextField field1 = new JTextField();
//		panel1.add(field1);
//		
//		JLabel lbl = new JLabel("+");
//		
//		panel1.add(lbl);
//		JTextField field2 = new JTextField();
//		panel1.add(field2);

		setBounds(200, 200, 450, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SimpleClac();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Ȯ��")) {
			// Ȯ�� ��ư Ŭ��
			// num1, num2 �� ��� �ִ� �� ��������
			try {
				int i = Integer.parseInt(num1.getText());
				int j = Integer.parseInt(num2.getText());
				// ������ ���ڸ� ����
				// ��� result �����ֱ� 11 => "11"
//			result.setText(Integer.toString(i + j));
//			result.setText(total+"");
				int total = i+j;
				result.setText(String.valueOf(total));
				
			} catch (Exception e2) {
				// ������ �� ���� �߻� �ܰ踦 ���
				// e.printStackTrace();
				JOptionPane.showMessageDialog(getParent(), "�Է°��� Ȯ�����ּ���");
				//System.out.println("�Է°��� �ּ���");
			}

		} else {
			num1.setText("");
			num2.setText("");
			result.setText("");
		}
	}

}
