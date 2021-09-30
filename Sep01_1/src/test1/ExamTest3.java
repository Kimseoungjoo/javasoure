package test1;

import java.io.IOException;
import java.util.Scanner;

public class ExamTest3 {
	public static void main(String[] args) throws IOException {

		boolean run = true;

		// 잔액
		int balance = 0;
		// 선택
//		int keyCode = 0;

		Scanner sc = new Scanner(System.in);

		while (run) {
			// 1. 선택 : 사용자한테 예금액 입력받기 => balance 추가
			// 2. 선택 : 사용자한테 출금액 입력받기 => balance 차감
			// 3. 선택 : balance 출력
			// 4. 선택 : run = false 변경 후 프로그램 종료
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("예금액 >>");
				balance += sc.nextInt();
				// == int money = sc.nextInt();
				// balance += money;
				break;
			case 2:
				System.out.print("출금액 >>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔액 >> "+balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("메뉴 확인");
				sc.close();
				break;
			}
//			if ((keyCode != 13) && (keyCode != 10)) {
//
//				System.out.println("===============은행업무==============");
//				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//				System.out.println("=====================================");
//				System.out.print("선택 >> ");
//
//			}
//
//			keyCode = System.in.read();
//			
//			if (keyCode == 49) {
//				
//				System.out.print("예금 하실 금액 :");
//				user = sc.nextInt();
//				balance += user;
//				
//			} else if (keyCode == 50) {
//			
//				System.out.print("출금 하실 금액 :");
//				user = sc.nextInt();
//				balance -= user;				
//
//			}else if(keyCode==51) {
//				
//			System.out.printf("남은 잔액 : %d\n",balance);
//			
//			}else if(keyCode==52) 
//				run =false;

		}

	}
}
