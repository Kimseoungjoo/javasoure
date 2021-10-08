package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class PizzaOrder extends JFrame implements ItemListener, ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private ButtonGroup group1, group2, group3;
	private JRadioButton rdo1, rdo2, rdo3, rdo4, rdo5, rdo6, rdo7, rdo8, rdo9, rdo10;
	private JLabel lbl;
	private int sum = 0;
	// 그룹별 주문 금액 변수 설정
	private int kindMoney, toppingMoney, sizeMoey;
	// 그룹별 제품 선택에 대한 변수 설정
	private String kind, topping, size;
	
//	static final int COMBO = 10000;
//	static final int POT = 12000;
//	static final int BULGO = 13000;
//	static final int PCM = 2000;
//	static final int PESM = 1000;
//	static final int BALAR = 3000;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					PizzaOrder frame = new PizzaOrder();
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
	public PizzaOrder() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PizzaOrder.class.getResource("/component/pizza1.png")));
		setBackground(Color.WHITE);
		setTitle("\uD53C\uC790\uC8FC\uBB38");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		lbl = new JLabel(
				"\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4");
		lbl.setForeground(new Color(204, 204, 255));
		lbl.setFont(new Font("D2Coding", Font.PLAIN, 16));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\uC885\uB958", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		rdo1 = new JRadioButton("\uCF64\uBCF4");
		panel_2.add(rdo1);

		rdo2 = new JRadioButton("\uD3EC\uD14C\uC774\uD1A0");
		panel_2.add(rdo2);

		rdo3 = new JRadioButton("\uBD88\uACE0\uAE30");
		panel_2.add(rdo3);
		

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\uCD94\uAC00 \uD1A0\uD551",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		rdo4 = new JRadioButton("\uD53C\uB9DD");
		panel_3.add(rdo4);

		rdo5 = new JRadioButton("\uCE58\uC988");
		panel_3.add(rdo5);

		rdo6 = new JRadioButton("\uD398\uD398\uB85C\uB2C8");
		panel_3.add(rdo6);

		rdo7 = new JRadioButton("\uBCA0\uC774\uCEE8");
		panel_3.add(rdo7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\uD06C\uAE30", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_4.setBackground(Color.WHITE);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		rdo8 = new JRadioButton("Small");
		panel_4.add(rdo8);
		rdo8.addItemListener(this);
		rdo9 = new JRadioButton("Midium");
		panel_4.add(rdo9);

		rdo10 = new JRadioButton("Large");
		panel_4.add(rdo10);
		group1 = new ButtonGroup();
		group1.add(rdo1);
		group1.add(rdo2);
		group1.add(rdo3);
		
		group2 = new ButtonGroup();
		group2.add(rdo4);
		group2.add(rdo5);
		group2.add(rdo6);
		group2.add(rdo7);
		
		group3 = new ButtonGroup();
		group3.add(rdo8);
		group3.add(rdo9);
		group3.add(rdo10);
		
		rdo1.addItemListener(this);
		rdo2.addItemListener(this);
		rdo3.addItemListener(this);
		rdo4.addItemListener(this);
		rdo5.addItemListener(this);
		rdo6.addItemListener(this);
		rdo7.addItemListener(this);
		rdo8.addItemListener(this);
		rdo9.addItemListener(this);
		rdo10.addItemListener(this);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton order = new JButton("\uC8FC\uBB38");
		order.addActionListener(this);
		panel_1.add(order);

		JButton cancel = new JButton("\uCDE8\uC18C");
		cancel.addActionListener(this);
		panel_1.add(cancel);

		JLabel lblNewLabel = new JLabel("\uAE08\uC561");
		panel_1.add(lblNewLabel);

		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		panel_1.add(textField);
		textField.setColumns(10);
	}
	private void clear() {
//		sum = 0;
		
		// 라디오 버튼 해제
		group1.clearSelection();
		group2.clearSelection();
		group3.clearSelection();
		textField.setText("");
		
		//그룹별 주문 금액 변수 초기화
		kindMoney = 0;
		toppingMoney = 0;
		sizeMoey = 0;
		// 그룹별 주문메세지 초기화 
		kind = "";
		topping = "";
		size = "";
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("주문")) {
			
			String orderList = "주문내역\n";
			orderList+="종류 : "+kind+"\n";
			orderList+="토핑 : "+topping+"\n";
			orderList+="크기 : "+size+"\n";
			orderList+="주문하시겠습니까?";
			
			
			int result = JOptionPane.showConfirmDialog(getParent(), orderList,"주문 완료",
					JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
			if(result ==0) {
				JOptionPane.showMessageDialog(getParent(), "주문이 완료되었습니다");
				clear();
			}else {
				clear();
			}
			
		} else {			
			clear();
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 라디오 버튼 이벤트 처리
		// 종류 : 콤보(10000), 포테이토(12000), 불고기(13000)
		// 추가 토핑 : 피망(2000), 치즈(2000), 페페로니(1000), 베이컨(3000)
		// 크기 : small(1000), medium(2000), large(3000)
		JRadioButton btn = (JRadioButton) e.getItem();
		
		// JRadioButton, JCheckBox 상태의 변화가 선택, 해제가 존재
		// 선택되는 시점의 이벤트 처리 
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(btn == rdo1) {
				kindMoney = 10000;
				kind = btn.getText();
			}else if(btn == rdo2) {
				kindMoney = 12000;
				kind = btn.getText();
			}else if(btn == rdo3) {
				kindMoney = 13000;
				kind = btn.getText();
			}else if(btn == rdo4) {
				toppingMoney = 2000;
				topping = btn.getText();
			}else if(btn == rdo5) {
				toppingMoney = 2000;
				topping = btn.getText();
			}else if(btn == rdo6) {
				toppingMoney = 1000;
				topping = btn.getText();
			}else if(btn == rdo7) {
				toppingMoney = 3000;
				topping = btn.getText();
			}else if(btn == rdo8) {
				sizeMoey = 1000;
				size = btn.getText();
			}else if(btn == rdo9) {
				sizeMoey = 2000;
				size = btn.getText();
			}else if(btn == rdo10) {
				sizeMoey = 3000;
				size = btn.getText();
			}
			int price = kindMoney + toppingMoney + sizeMoey;
			textField.setText(price+"");
		}
//		switch (btn.getText()) {
//		case "콤보":
//			sum += 10000;
//			break;
//		case "포테이토":
//			sum += 12000;
//			break;
//		case "불고기":
//			sum += 13000;
//			break;
//		case "피망":
//		case "치즈":
//		case "Medium":
//			sum += 2000;
//			break;
//		case "베이컨":
//		case "Large":
//			sum += 3000;
//			break;
//		case "페페로니":
//		case "Small":
//			sum += 1000;
//			break;
//
//		default:
//
//			break;
//		}
//		textField.setText(sum + "");
	}

}
