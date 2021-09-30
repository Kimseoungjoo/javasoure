package classTest;

import java.io.IOException;
import java.security.AccessControlContext;
import java.util.Scanner;

public class AccountEx {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int keyCode=0;
		int inMoney;
		int outMoney;
		boolean run = true;
		
		Account account1 = new Account();
		
		while (run) {

			if (keyCode != 13 && keyCode != 10) {
				System.out.println("====================================");
				System.out.println("  1. 입금하기  2. 출금하기   3. 종료");
				System.out.println("====================================");
				System.out.print("선택 : ");

			}
			
			keyCode = System.in.read();
			if (keyCode == 49) {
				account1.print();
				System.out.print("입급액을 입력하시오 : ");
				inMoney = sc.nextInt();
				account1.addInmoney(inMoney);
				account1.print1();
			} else if (keyCode == 50) {
				account1.print();
				System.out.print("출금액을 입력하시오 : ");
				outMoney = sc.nextInt();
				account1.subOutmoney(outMoney);
				account1.print1();
			}else {
				
				System.out.println("종료");
				run = false;
			}
		}
	
	
	
	}
}
