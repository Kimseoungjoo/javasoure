package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioButtonTest2 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButtonTest2 frame = new JRadioButtonTest2();
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
	public JRadioButtonTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Size", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JRadioButton radio1 = new JRadioButton("Small");
		panel.add(radio1);
		radio1.addItemListener(this);
			
		JRadioButton radio2 = new JRadioButton("Medium");
		radio2.addItemListener(this);
		panel.add(radio2);
		
		JRadioButton radio3 = new JRadioButton("Large");
		radio3.addItemListener(this);
		panel.add(radio3);
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton btn = (JRadioButton) e.getItem();
		textField.setText(btn.getText());
	}

}
