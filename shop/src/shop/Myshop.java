package shop;

import java.util.Scanner;

public class Myshop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// 장바구니 배열의 목적
	private Product[] carts = new Product[5]; // 베열 선언 >> 배열을 생성해야한다.

	// 회원 정보를 가지고 있는 배열 - 회원이름, 결제타입
	private User users[] = new User[2];

	// 상포 정보 배열 - 상품명, 가격, 상세정보
	private Product products[] = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("블로거", PayType.CASH);
//		for (int i = 0; i < users.length; i++) {
//			System.out.print("고객 이름 작성 : ");
//			String name = sc.next();
//			System.out.print("결제 타입(CARD/CASH)");
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
		products[0] = new CellPhone("Z플립", 1500000, "SKT");
		products[1] = new CellPhone("아이폰 13", 1520000, "KT");
		products[2] = new SmartTv("삼성 3D TV", 3500000, "4k");
		products[3] = new SmartTv("LG 스마트 TV", 3000000, "4k");
		products[4] = new SmartTv("삼성 울트라 TV", 2800000, "Full HD");
//		for (int i = 0; i < 2; i++) {
//			System.out.print("SmarTV 상품명 :");
//			String name = sc.next();
//			System.out.print("SmarTV 가격 :");
//			int price = sc.nextInt();
//			System.out.print("SmarTV 상세정보 :");
//			String info = sc.next();
//			products[i] = new SmartTv(name, price, info);
//
//		}
//		for (int i = 2; i < products.length; i++) {
//		System.out.print("휴대폰 상품명 :");
//			String name = sc.next();
//			System.out.print("휴대폰 가격 :");
//			int price = sc.nextInt();
//			System.out.print("휴대폰 상세정보 :");
//			String info = sc.next();
//			products[i] = new CellPhone(name, price, info);
//
//		}
	}

	@Override
	public void start() {
		System.out.println(title + " :  메인화면 - 계정화면");
		System.out.println("=============================");
		for (int i = 0; i < users.length; i++) {
			System.out.println("[" + i + "] " + users[i].getName() + "(" + users[i].getPayType() + ")"); // System.out.printf("[%d] %s(%s),i,users[i].getName(),users[i].getPayType());
																											
		}
		System.out.println("[x] 종 료");
		System.out.print("선 택 : ");
		String num = sc.next();
		System.out.println("## " + num + " 선택##");
		selUser = num;
		switch (num) {
		case "1":
		case "0":
			productList();
			break;

		default:
			System.out.println("종료하였습니다");
			break;
		}

	}

	void productList() {
		boolean run = true;
		int  j =0;
		System.out.println(title + " :  상품목록 - 상품선택");
		System.out.println("===============================");
		for (int i = 0; i < products.length; i++) {
			System.out.print("[" + i + "]");
			products[i].printDetail();

		}
		String num;
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		while(run) {
			System.out.print("선 택 : ");
			num = sc.next();
			switch (num) {
			case "h":
				System.out.println("## " + num + " 선택##");
				start();
				break;
			case "c":
				System.out.println("## " + num + " 선택##");
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
		System.out.println(title + " :  체크아웃");
		System.out.println("===============================");
		for(int i =0; i<carts.length;i++) {
			if(carts[i]!=null) {
				System.out.printf("[%d] %s (%d)",i,carts[i].getPname(),carts[i].getPrice());
				sum += carts[i].getPrice();
			}
		}
		System.out.println("===============================");
		System.out.println("결제 방법 : "+users[Integer.parseInt(selUser)].getPayType());
		System.out.println("합계 : "+sum+" 원 입니다");
		System.out.println("[p] 이전, [q] 결제 완료");       //carts 의 초기화는 나중에 세션을 통해 가능하다 
		System.out.print("선택");
		String sel = sc.next();
		switch (sel) {
		case "p":
			productList();
			break;
			
		default:
			System.out.println("## 결제가 완료되었습니다. 종료합니다.##");
			break;
		}
		
		
	}

}
