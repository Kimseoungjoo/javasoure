package test;

import java.util.Scanner;

public class SwitchMain3 {
	public static void main(String[] args) {
		//String position = "����";
		//��å�� ���� �̸� 700 �����̸� 500, ������ 300
		//position �Է� ���� �� �ݾ� ����ϴ� ���
		Scanner k = new Scanner(System.in);
		System.out.print("�ڽ��� ��å�� ��������(����,����..) : ");
		String position = k.next();
		k.close();
		switch (position) {
		case "����":
			System.out.println("���� 700����");
			break;
		case "����":
			System.out.println("���� 500����");
			break;

		default:
			System.out.println("���� 300����");
			break;
		}
	}
}