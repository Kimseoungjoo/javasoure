package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* FlowLayout : 컴포넌트를 왼쪽에서 오른쪽으로 배치
 * 				오른쪽 공간이 없으면 아래로 내려감
 * 
 */

public class FlowLayoutTest1 extends JFrame {
	public FlowLayoutTest1()	{
		setTitle("BorderLayout 테스트");
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 기본 레이아웃 BorderLayout
		// 레이아웃 변경
		// setLayout(new FlowLayout());
	
		
		// 현재 프레임에 contentPnae 가져오기
//		Container container = getContentPane();
		// contentPane 에 새로운 레이아웃 설정 
//		container.setLayout(new FlowLayout());
		
		
//		JPanel panel = new JPanel(); // 기본 레이아웃이 FlowLayout
//		setContentPane(panel);
		
		
		
		JButton btn1 = new JButton("파");
		add(btn1,BorderLayout.WEST);
	
		JButton btn2 = new JButton("리");
		add(btn2,BorderLayout.CENTER);

		JButton btn3 = new JButton("바");
		add(btn3,BorderLayout.EAST);
	
		JButton btn4 = new JButton("게");
		add(btn4,BorderLayout.SOUTH);
		
		JButton btn5 = new JButton("트");
		add(btn5,BorderLayout.NORTH);
	
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		FlowLayoutTest1 bor = new FlowLayoutTest1();
	}
}
