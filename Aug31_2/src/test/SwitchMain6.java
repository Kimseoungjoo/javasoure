package test;

import java.util.Scanner;

// ����(1), ����(2), ��(3)
// ���� - ��ǻ��
// ���� 1~3 �ڵ����� ���� 
// ���� �޴� �κ� - �Է� 
public class SwitchMain6 {
	public static void main(String[] args) {
		/*
		 * Scanner k = new Scanner(System.in);
		 * 
		 * System.out.print("���� ���� �� �� ������ ���ðڽ��ϱ�(1,2,3)? :");
		 *  int me = k.nextInt();
		 * k.close();
		 * 
		 * int rsp = (int) (Math.random() * 3) + 1; 
		 * int result = me - rsp;
		 * 
		 * System.out.println("���� �� �� : " + me);
		 *  System.out.println("��ǻ�Ͱ� �� �� : " + rsp);
		 * 
		 * switch (result) {
		 * 
		 * case -2: case 1:
		 * System.out.println("�̰���ϴ�"); break; }
		 *  break;
		 *   case -1: case 2:
		 * System.out.println("�����ϴ�");
		 *  break;
		 * 
		 * default: 
		 *  System.out.println("�����ϴ�");
		 */// ���� §��
		Scanner k = new Scanner(System.in);
		
		int com = (int)(Math.random()*3)+1;
		
		System.out.print("����(1) ����(2) ��(3) �� �ϳ��� �Է��ϼ��� : ");
		int user = k.nextInt();
		k.close();
		
		System.out.println("�� : "+user+", ��ǻ�� : "+com);
		
		switch (user-com) {
		
		case 1: case -2:
			System.out.println("����� �̰���ϴ�");
			break;
		
		case 2: case -1:
			System.out.println("����� �����ϴ�");
			break;
		
		default:
			System.out.println("�����ϴ�");
			break;
		}		
	}
}