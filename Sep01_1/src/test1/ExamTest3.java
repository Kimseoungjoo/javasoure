package test1;

import java.io.IOException;
import java.util.Scanner;

public class ExamTest3 {
	public static void main(String[] args) throws IOException {

		boolean run = true;

		// �ܾ�
		int balance = 0;
		// ����
//		int keyCode = 0;

		Scanner sc = new Scanner(System.in);

		while (run) {
			// 1. ���� : ��������� ���ݾ� �Է¹ޱ� => balance �߰�
			// 2. ���� : ��������� ��ݾ� �Է¹ޱ� => balance ����
			// 3. ���� : balance ���
			// 4. ���� : run = false ���� �� ���α׷� ����
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("���ݾ� >>");
				balance += sc.nextInt();
				// == int money = sc.nextInt();
				// balance += money;
				break;
			case 2:
				System.out.print("��ݾ� >>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("�ܾ� >> "+balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("�޴� Ȯ��");
				sc.close();
				break;
			}
//			if ((keyCode != 13) && (keyCode != 10)) {
//
//				System.out.println("===============�������==============");
//				System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
//				System.out.println("=====================================");
//				System.out.print("���� >> ");
//
//			}
//
//			keyCode = System.in.read();
//			
//			if (keyCode == 49) {
//				
//				System.out.print("���� �Ͻ� �ݾ� :");
//				user = sc.nextInt();
//				balance += user;
//				
//			} else if (keyCode == 50) {
//			
//				System.out.print("��� �Ͻ� �ݾ� :");
//				user = sc.nextInt();
//				balance -= user;				
//
//			}else if(keyCode==51) {
//				
//			System.out.printf("���� �ܾ� : %d\n",balance);
//			
//			}else if(keyCode==52) 
//				run =false;

		}

	}
}
