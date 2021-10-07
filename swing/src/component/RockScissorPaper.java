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
		setTitle("가위 바위 보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 현재 contentPane 가져오기
		Container contentPane =  getContentPane();
		
		// 상단메세지
		JLabel label = new JLabel("아래에 버튼 중에서 하나를 클릭하시오");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(label,BorderLayout.NORTH);// add(label,BorderLayout.NORTH);
		
		// 가운데 이미지 출력
		// JPanel 을 center에 부착 => JPNEL을 GRIDLAYOUT 변경 => 버튼 3개 부착
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(0, 3));
		
		rock = new JButton();
		scissor = new JButton();
		paper = new JButton();
		
		// 아이콘 가져오기
		rock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/rock.png")));
		scissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/scissor.png")));
		paper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/paper.png")));
		
		// 액션 넣기 
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
		
		// 하단 결과 출력
		textField = new JTextField();
		textField.setFont(new Font("굴림",Font.BOLD,18));
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
		// 게임자가 누른 가위, 바위, 보 가져오기
		int user = Integer.parseInt(e.getActionCommand());
		String com;
		// 컴퓨터의 가위, 바위, 보 결정 
		int i = (int)(Math.random()*3);
		switch (i) {
		case 0:
			com = "바위";
			break;
		case 1:
			com = "가위";
			break;

		default:
			com = "보";
			break;
		}
		// 컴퓨터와 user 사이에서 누가 이겼는지 출력
		
		int result = user-i;
		switch (result) {
		case -2: // 졌을 떄 사용자와 컴퓨터의 차이 값 
		case 1:
			textField.setText("컴퓨터 "+com+": 졌습니다");
			break;
		case -1: // 이겼을 떄 사용자와 컴퓨터의 차이 값 
		case  2:
			textField.setText("컴퓨터 "+com+": 이겼습니다");
			break;
		default:
			textField.setText("컴퓨터 "+com+": 비김");
			break;
		}
		
		
	}

}
