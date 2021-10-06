package container;

import javax.swing.JFrame;

public class FrameTest1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("SWING FRAME");
		// SIZE 하나 만들어낼 수 있다~
		f.setSize(300,300);
		// 화면에 출력 시켜주는 클라스~ 
		f.setVisible(true);
		// 직접 프레임을 상속 받아서 한다 
	}
}
