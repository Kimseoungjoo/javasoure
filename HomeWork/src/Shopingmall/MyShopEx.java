package Shopingmall;

import java.io.IOException;
import java.util.Scanner;

public class MyShopEx {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int keyCode = 0;
		boolean run = true;
		String[] product;
		while (run) {

			if (keyCode != 13 && keyCode != 10) {
				System.out.println("================================");
				System.out.println("  1. ������  2. ����� 3. �� �� ");
				System.out.println("================================");
				System.out.print("���� : ");
			}
			keyCode = System.in.read();

			if (keyCode == 49) {
				System.out.print("���θ� �̸� :");
				String title = sc.next();
				Myshop my = new Myshop(title);
//				System.out.print("��ǰ��� ����");
//				int amount = sc.nextInt();
//				Myshop my = new Myshop(title, product[amount]);

			} else if (keyCode == 50) {
				System.out.println("================================");
				System.out.println("  1. ���  2. ��ǰ��� 3. �� ��  ");
				System.out.println("================================");
				System.out.print("���� : ");
			} else {

				System.out.println("����");
				run = false;
			}
		}
	}
}
