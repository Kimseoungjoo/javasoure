//		String select;
//		System.out.println(title + " : ����ȭ�� - ��������");
//		System.out.println("=============================");
//		System.out.println("[0] " + selUser + "");
//		System.out.println("[1] ");
//		System.out.println("[x] ����");
//		System.out.print("���� : ");
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
//			System.out.println("##�����մϴ�##");
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
		System.out.print("TV��ǰ ��� ���� :");
		int amount = sc.nextInt();
		System.out.print("����Ʈ����ǰ ��� ���� :");
		int amount1 = sc.nextInt();

		for (int i = amount1; i < amount ; i++) {
			System.out.println();
			for(int j=0;j<amount1;j++) {
				System.out.print("����Ʈ�� ��ǰ ��� :");
			}
		}
	}

	@Override
	public void start() {

	}

}
