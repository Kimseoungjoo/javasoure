package inheritance;

public class BonusPointAccount extends Account2 {
	// 계좌번호, 계좌주, 잔액, 보너스 포인트 / 입금하다, 출금하다, 보너스 포인트 추가
	private int bonusPoint;

	public BonusPointAccount(String accountNo, String name, int balance, int bonusPoint) {
		super(accountNo, name, balance);
		this.bonusPoint = bonusPoint;
	}

		public int getBonusPoint() {
			return bonusPoint;
		}
	
	@Override
	void deposit(int inMoney) {
		// 예금하다,
		// 보녀스 포인트 += 예금액의 0.1% 보너스 포인트로 담는다

		bonusPoint += inMoney * 0.001;

		super.deposit(inMoney);
	}
}
