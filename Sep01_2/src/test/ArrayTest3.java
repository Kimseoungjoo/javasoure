package test;

import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {
		// int Ÿ���� �迭 5�� ����
		// 0 10 20 30 40
		Scanner sc = new Scanner(System.in);
		int score[] = { 0, 10, 20, 30, 40 };// ���� �Ϲ����� ���
		
		for(int idx:score) {
			System.out.println(idx+"\t");
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}

		System.out.println();
		// String Ÿ���� �迭 5�� ����
		// �����̸� �ʱ�ȭ

//		String fruit[] = new String[4];
//		for (int i = 0; i < fruit.length; i++) {
//			System.out.print("\n�����̸� �ۼ�");
//			fruit[i] = sc.next();
//
//		}
		String fruit[] = {"����","������","���","�ٳ���"};
		for (int i = 0; i < fruit.length; i++) {
			System.out.print(fruit[i] + "\n");
		}
		//���� for��
		for(String f:fruit) {
			System.out.println(f+"\t");
		}

	}
}
