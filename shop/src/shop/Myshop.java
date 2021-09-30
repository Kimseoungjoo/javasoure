package shop;

import java.util.Scanner;

public class Myshop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// ��ٱ��� �迭�� ����
	private Product[] carts = new Product[5]; // ���� ���� >> �迭�� �����ؾ��Ѵ�.

	// ȸ�� ������ ������ �ִ� �迭 - ȸ���̸�, ����Ÿ��
	private User users[] = new User[2];

	// ���� ���� �迭 - ��ǰ��, ����, ������
	private Product products[] = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("��ΰ�", PayType.CASH);
//		for (int i = 0; i < users.length; i++) {
//			System.out.print("�� �̸� �ۼ� : ");
//			String name = sc.next();
//			System.out.print("���� Ÿ��(CARD/CASH)");
//			String type = sc.next();
//			if (type == "CARD") {
//				users[i] = new User(name, PayType.CARD);
//			} else
//				users[i] = new User(name, PayType.CASH);
//
//		}
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("Z�ø�", 1500000, "SKT");
		products[1] = new CellPhone("������ 13", 1520000, "KT");
		products[2] = new SmartTv("�Ｚ 3D TV", 3500000, "4k");
		products[3] = new SmartTv("LG ����Ʈ TV", 3000000, "4k");
		products[4] = new SmartTv("�Ｚ ��Ʈ�� TV", 2800000, "Full HD");
//		for (int i = 0; i < 2; i++) {
//			System.out.print("SmarTV ��ǰ�� :");
//			String name = sc.next();
//			System.out.print("SmarTV ���� :");
//			int price = sc.nextInt();
//			System.out.print("SmarTV ������ :");
//			String info = sc.next();
//			products[i] = new SmartTv(name, price, info);
//
//		}
//		for (int i = 2; i < products.length; i++) {
//		System.out.print("�޴��� ��ǰ�� :");
//			String name = sc.next();
//			System.out.print("�޴��� ���� :");
//			int price = sc.nextInt();
//			System.out.print("�޴��� ������ :");
//			String info = sc.next();
//			products[i] = new CellPhone(name, price, info);
//
//		}
	}

	@Override
	public void start() {
		System.out.println(title + " :  ����ȭ�� - ����ȭ��");
		System.out.println("=============================");
		for (int i = 0; i < users.length; i++) {
			System.out.println("[" + i + "] " + users[i].getName() + "(" + users[i].getPayType() + ")"); // System.out.printf("[%d] %s(%s),i,users[i].getName(),users[i].getPayType());
																											
		}
		System.out.println("[x] �� ��");
		System.out.print("�� �� : ");
		String num = sc.next();
		System.out.println("## " + num + " ����##");
		selUser = num;
		switch (num) {
		case "1":
		case "0":
			productList();
			break;

		default:
			System.out.println("�����Ͽ����ϴ�");
			break;
		}

	}

	void productList() {
		boolean run = true;
		int  j =0;
		System.out.println(title + " :  ��ǰ��� - ��ǰ����");
		System.out.println("===============================");
		for (int i = 0; i < products.length; i++) {
			System.out.print("[" + i + "]");
			products[i].printDetail();

		}
		String num;
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		while(run) {
			System.out.print("�� �� : ");
			num = sc.next();
			switch (num) {
			case "h":
				System.out.println("## " + num + " ����##");
				start();
				break;
			case "c":
				System.out.println("## " + num + " ����##");
				checkOut();
				break;
			default:
				carts[j] = products[Integer.parseInt(num)]; // for(int i =0; i<carts.length;i++){ if(carts[i]==null){ carts[i] = products[Integer.parseInt(num)]; break;}
				j++;
				break;
			}
		}

	}
	void checkOut() {
		int sum = 0;
		System.out.println(title + " :  üũ�ƿ�");
		System.out.println("===============================");
		for(int i =0; i<carts.length;i++) {
			if(carts[i]!=null) {
				System.out.printf("[%d] %s (%d)",i,carts[i].getPname(),carts[i].getPrice());
				sum += carts[i].getPrice();
			}
		}
		System.out.println("===============================");
		System.out.println("���� ��� : "+users[Integer.parseInt(selUser)].getPayType());
		System.out.println("�հ� : "+sum+" �� �Դϴ�");
		System.out.println("[p] ����, [q] ���� �Ϸ�");       //carts �� �ʱ�ȭ�� ���߿� ������ ���� �����ϴ� 
		System.out.print("����");
		String sel = sc.next();
		switch (sel) {
		case "p":
			productList();
			break;
			
		default:
			System.out.println("## ������ �Ϸ�Ǿ����ϴ�. �����մϴ�.##");
			break;
		}
		
		
	}

}
