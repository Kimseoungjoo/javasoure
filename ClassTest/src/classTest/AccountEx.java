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
				System.out.println("  1. �Ա��ϱ�  2. ����ϱ�   3. ����");
				System.out.println("====================================");
				System.out.print("���� : ");

			}
			
			keyCode = System.in.read();
			if (keyCode == 49) {
				account1.print();
				System.out.print("�Ա޾��� �Է��Ͻÿ� : ");
				inMoney = sc.nextInt();
				account1.addInmoney(inMoney);
				account1.print1();
			} else if (keyCode == 50) {
				account1.print();
				System.out.print("��ݾ��� �Է��Ͻÿ� : ");
				outMoney = sc.nextInt();
				account1.subOutmoney(outMoney);
				account1.print1();
			}else {
				
				System.out.println("����");
				run = false;
			}
		}
	
	
	
	}
}
