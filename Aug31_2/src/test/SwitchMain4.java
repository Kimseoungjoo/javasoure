package test;

//import java.util.Scanner;

public class SwitchMain4 {
	public static void main(String[] args) {
		//���ڸ� �Է¹޾� 8 : ����� �մϴ�
		// 9 : ȸ�Ǹ� �մϴ�
		// 10 : ���� ��
		// ������ : �ܱ� ��
		// 8~11 ������ ���ڰ� �������� �ۼ� (random)
		int time = (int)(Math.random()*4+8);// Math.random()*6; >> 0~5 ���� ��ȯ
		System.out.println(time);
		switch (time) {
		case 8:
			System.out.println("��� ��");
			break;
		case 9:
			System.out.println("ȸ�� ��");
			break;
		case 10:
			System.out.println("���� ��");
			break;
		default:
			System.out.println("�ܱ� ��");
			break;
		}
	}
}
