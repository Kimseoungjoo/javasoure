package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener1 implements ActionListener {

/* ActionListener
 * JButton, JMenuItem, JTextField ������Ʈ�� �̺�Ʈ�� ���
 * 
 * JButton => ���콺�� enter ��ư ���� 
 * JMenuItem => �޴����� ex) ����â 
 * JTextFeild => Enter Ű �Է�
 */
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Action�� �Ͼ ��ü�� Command ��������
		System.out.println("e.getActionCommand() "+e.getActionCommand());
		System.out.println("e.getID() "+e.getID());
		// �̺�Ʈ����� ��� ������ �����´�.  
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
