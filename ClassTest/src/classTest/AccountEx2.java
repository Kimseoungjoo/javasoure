package classTest;

import java.io.IOException;
import java.security.AccessControlContext;
import java.util.Scanner;

public class AccountEx2 {
	public static void main(String[] args) throws IOException {
		//홍길동 계좌
		Account2 account1 = new Account2();
//		account1.accountNo = "12-1231-32131";
//		account1.name = "홍길동";
//		account1.balance = 10000;
		
		// 생성자를 사용하지 않고 멤버변수 값 초기화 
		// 계좌번호
				account1.setAccountNo("12-1231-32131");
		// 이름
				account1.setName("홍길동");
		// 잔액
		
				account1.setBalance(20000);
		
		//입금
		account1.deposit(300);
//		System.out.println("입금 후 잔액 : "+);
				
		//출금
		System.out.println("현재 잔액 : "+account1.withdraw(50000));
		
		// 성춘향 계좌
		Account2 account2 = new Account2("12-32131-313132", "성춘향");
		System.out.println("현재 잔액 조회 : "+ account2.getBalance());
		
		
		
		// 박보검 계좌
		Account2 account3 = new Account2("122-01-23131", "박보검", 60000);
		System.out.println("현재 잔액 조회 : "+ account3.getBalance());
	
	}
}
