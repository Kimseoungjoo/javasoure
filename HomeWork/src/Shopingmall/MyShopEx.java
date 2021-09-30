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
				System.out.println("  1. 관리자  2. 사용자 3. 종 료 ");
				System.out.println("================================");
				System.out.print("선택 : ");
			}
			keyCode = System.in.read();

			if (keyCode == 49) {
				System.out.print("쇼핑몰 이름 :");
				String title = sc.next();
				Myshop my = new Myshop(title);
//				System.out.print("상품등록 갯수");
//				int amount = sc.nextInt();
//				Myshop my = new Myshop(title, product[amount]);

			} else if (keyCode == 50) {
				System.out.println("================================");
				System.out.println("  1. 등록  2. 상품목록 3. 구 매  ");
				System.out.println("================================");
				System.out.print("선택 : ");
			} else {

				System.out.println("종료");
				run = false;
			}
		}
	}
}
