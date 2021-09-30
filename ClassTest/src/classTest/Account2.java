package classTest;

public class Account2 {
	//속성 : 계좌번호(122-01-12222), 잔액(정수), 이름
	//기능 : 입금, 출금
	//입금한다. (입력값 : 입급액, 반환값:없음) => 현재잔액 +=입금액
	//출금한다. (입력값 : 입급액, 반환값:없음) => 현재잔액 -=출금액
	
	// 생성자 작성
	// [마우스 오른쪽] -> [source] -> [Generate Constructor using fields...]
	// [마우스 오른쪽] -> [source] -> [Generate Constructor using super class...] >> default 생성자
	private String accountNo;
	private String name;
	private int balance;
	
	
	public Account2() {
		super();
	}

	
	public Account2(String accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public Account2(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
	}
	//멤버 변수의 값을 리턴하고 싶다면?
	//get~ 으로 시작
	public int getBalance() {
		return balance;
	}
	
	// 기능 : 입금한다/
	void deposit(int inMoney)	{
		balance +=inMoney;
	}

	//  	  출금한다.
	int withdraw(int outMoney) {
		this.balance -= outMoney;
		return balance;
	}
	
	
	// 외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업시
	// set ~ 으로 메소드를 작성한다.
	
	// 멤버변수 : 계좌번호를 변경하고 싶다면 ?
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

