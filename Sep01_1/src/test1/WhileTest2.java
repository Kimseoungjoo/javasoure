package test1;

import java.io.IOException;
//å p.59����
public class WhileTest2 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int keyCode = 0;
		int speed = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {//13>>CR, 10 >> LF : ���� 
				//(TIP. IF ������ ���� ������ �ڵ��� �������� ���ؼ��̴�)
				System.out.println("=============================");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("=============================");
				System.out.println("���� : ");
			}

			keyCode = System.in.read();//int�� ��ȯ �Ѱ��̴�>> 
									   //�ƽ�Ű �ڵ尪(1>>49���� ��ȯ�ȴ�
									   //              2>>50,3>>51

			if (keyCode == 49) {// 49 >> 1
				speed++;
				System.out.println("���� �ӵ� : " + speed);
			} else if (keyCode == 50) {//50 >>2
				speed--;
				System.out.println("����ӵ� : " + speed);
			} else if (keyCode == 51) {//51 >>3
				run = false;
			}

		}
		System.out.println("���α׷� ����");
	}
}
