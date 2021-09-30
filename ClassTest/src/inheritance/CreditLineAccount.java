package inheritance;

public class CreditLineAccount extends Account2 {
	private int creditLine; // 마이너스 한도

	public CreditLineAccount(String accountNo, String name, int balance, int creditLine) {
		super(accountNo, name, balance);
		this.creditLine = creditLine;
	}
//	계좌번호, 계좌주, 잔액, 마이너스한도 / 입금하다, 출금하다

	// 출금하다 오버라이딩
	// 부모의 기능 : 잔액 = 잔액 - 출금액;
	// 자식 : 잔액(현재잔액 + 마이너스 한도액) - 출금액
	@Override
	int withdraw(int outMoney) {
		// 현재잔액 +마이너스 한도 필드보다 사용금액이 많으면 인출불가msg
		if ((getBalance() + creditLine) < outMoney)
		{
			System.out.println("사용금액 한도인출불가");
			return 0;
		}
			// 잔액(현재잔액 + 마이너스 한도액) - 출금액
			setBalance(getBalance()-outMoney);
			return getBalance();
	}

}
