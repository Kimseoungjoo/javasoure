package test;

import java.util.Scanner;

//����ڿ��� ���ϴ� ������ ���� �Է¹ޱ�

public class LoopTest4 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in/*Ű����� �Է��� �޴´�*/);

		System.out.println("���ϴ� ������ ���ڸ� �Է��ϼ��� :");
		int user = k.nextInt();
		k.close();

		System.out.printf("----%d��-----\n", user);

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d =%d \n", user, i, (user * i));
			//==System.out.println(num+" * "+i+" = " + (num*i);
		}


	}
}
