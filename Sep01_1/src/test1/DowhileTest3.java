package test1;

import java.util.Scanner;

public class DowhileTest3 {
	public static void main(String[] args) {
		// ��ǻ�Ͱ� 1~100������ ������ ���Ƿ� ����
		// ����ڴ� ��ǻ�Ͱ� ������ �ִ� ���ڰ� �������� �˾Ƹ��߱�
		int num = (int) (Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		int user = 0;
		do {
			System.out.print("������ ���ڸ� �Է����ּ��� >>");
			user = sc.nextInt();
			if (user < num) {
				System.out.println("��!! �� �� ū ���� �Է����ּ���");
			} else
				System.out.println("��!! �� �� ���� ���� �Է����ּ���");
		} while (user != num);
		sc.close();
		System.out.println("�����Դϴ�~ ");
		System.out.println(num);
	}
}
