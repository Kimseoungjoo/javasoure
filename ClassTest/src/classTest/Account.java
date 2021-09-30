package classTest;

import java.util.Scanner;

public class Account {
	//속성 : 계좌번호(122-01-12222), 잔액(정수), 이름
	//기능 : 입금, 출금
	//입금한다. (입력값 : 입급액, 반환값:없음) => 현재잔액 +=입금액
	//출금한다. (입력값 : 입급액, 반환값:없음) => 현재잔액 -=출금액
	Scanner sc = new Scanner(System.in);
	private String accountNo;
	private String name;
	private int inMoney;
	private int outMoney;
	private int store;
	void addInmoney(int inMoney)	{
		store+=inMoney;
	}
	
	int subOutmoney(int outMoney) {
		this.store -= outMoney;
		return store;
	}
	void print()	{
		System.out.print("계좌번호 입력 :");
		accountNo = sc.next();
		System.out.print("이름 입력 :");	
		name = sc.next();
	}
	void print1()	{
		System.out.println("====================================");
		System.out.println("계좌 번호 :"+accountNo);			
		System.out.println("이름 : "+name);			
		System.out.println("현재 금액 :" +store);
	}
}
