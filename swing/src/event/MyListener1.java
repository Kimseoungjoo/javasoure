package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener1 implements ActionListener {

/* ActionListener
 * JButton, JMenuItem, JTextField 컴포넌트의 이벤트를 담당
 * 
 * JButton => 마우스나 enter 버튼 선택 
 * JMenuItem => 메뉴선택 ex) 도구창 
 * JTextFeild => Enter 키 입력
 */
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Action이 일어난 객체의 Command 가져오기
		System.out.println("e.getActionCommand() "+e.getActionCommand());
		System.out.println("e.getID() "+e.getID());
		// 이벤트대상의 모든 정보를 가져온다.  
//	JButton[,65,5,60x28,alignmentX=0.0,alignmentY=0.5,border=javax.swing.plaf.BorderUIResource
//			$CompoundBorderUIResource@6a30795b,flags=296,maximumSize=,minimumSize=,
//			preferredSize=,defaultIcon=,disabledIcon=,disabledSelectedIcon=,
//			margin=javax.swing.plaf.InsetsUIResource[top=2,left=14,bottom=2,right=14],
//			paintBorder=true,paintFocus=true,pressedIcon=,
//			rolloverEnabled=true,rolloverIcon=,rolloverSelectedIcon=,selectedIcon=,text=click,defaultCapable=true]
//	
		System.out.println("e.getSource() "+e.getSource());
	}

}
