package test1;

import java.io.IOException;

//�ֻ��� 2�� ������

//������ �ֻ��� �� ��� ex)(1,4)

//�ֻ��� ���� �հ谡 5�� �ƴϸ� ��� ������
// 5�� �Ǹ� ������ ���߱�

public class ExamTest1 {
	public static void main(String[] args) throws IOException {
		int dice1 = 0;
		int dice2 = 0;
		int keyCode = 0;
		boolean run = true;
		while (run) {

			if (keyCode != 13 && keyCode != 10) {
				System.out.println("======2���� �ֻ��� �� 5������======");
				System.out.println("  1. ����!            2.�� ��!");
				System.out.println("===================================");
				System.out.print("���� : ");

			}
			
			keyCode = System.in.read();
			
			
			if (keyCode == 49) {
				dice1 = (int) (Math.random() * 6) + 1;
				dice2 = (int) (Math.random() * 6) + 1;

				System.out.printf("ù���� �ֻ���  : %d  \n�ι�° �ֻ���  : %d \n���� : %d \n", dice1, dice2, (dice1 + dice2));
			} else if (keyCode == 50) {
				System.out.println("����...");
				
				run = false;
			}

			if (dice1 + dice2 == 5) {
				System.out.println("����");
				break;
			}
		}

	}
}
