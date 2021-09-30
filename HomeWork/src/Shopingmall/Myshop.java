//		String select;
//		System.out.println(title + " : 메인화면 - 계정선택");
//		System.out.println("=============================");
//		System.out.println("[0] " + selUser + "");
//		System.out.println("[1] ");
//		System.out.println("[x] 종료");
//		System.out.print("선택 : ");
//
//		select = sc.next();
//		switch (select.charAt(0)) {
//		case '0':
//
//		case '1':
//
//			break;
//		case '2':
//
//			break;
//		default:
//			System.out.println("##종료합니다##");
//			break;
//		}
package Shopingmall;

import java.util.Scanner;

public class Myshop implements IShop {
	private String title;
	String[] product;
	private String[] genUser;
	Scanner sc = new Scanner(System.in);

	void productList() {

	}

	public Myshop(String title) {
		super();
		this.title = title;
	}

	public Myshop(String[] genUser) {
		super();
		this.genUser = genUser;
	}

	void checkOut() {
	}

	@Override // IShop
	public String setTitle() {

		return title;
	}

	@Override
	public void genUser() {

	}

	@Override
	public void genProduct() {
		System.out.print("TV상품 등록 갯수 :");
		int amount = sc.nextInt();
		System.out.print("스마트폰상품 등록 갯수 :");
		int amount1 = sc.nextInt();

		for (int i = amount1; i < amount ; i++) {
			System.out.println();
			for(int j=0;j<amount1;j++) {
				System.out.print("스마트폰 상품 등록 :");
			}
		}
	}

	@Override
	public void start() {

	}

}
