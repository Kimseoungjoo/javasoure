package inheritance;

public class BonusPointAccount extends Account2 {
	// ���¹�ȣ, ������, �ܾ�, ���ʽ� ����Ʈ / �Ա��ϴ�, ����ϴ�, ���ʽ� ����Ʈ �߰�
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
		// �����ϴ�,
		// ���ེ ����Ʈ += ���ݾ��� 0.1% ���ʽ� ����Ʈ�� ��´�

		bonusPoint += inMoney * 0.001;

		super.deposit(inMoney);
	}
}
