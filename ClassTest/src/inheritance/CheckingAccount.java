package inheritance;

public class CheckingAccount extends Account2 {
	// ���¹�ȣ, ������, �ܾ� > �θ�
	// �Ա��ϴ�, ����ϴ� > �θ�

	// ī���ȣ(111-11-1234)
	private String cardNo;

	public CheckingAccount(String accountNo, String name, int balance, String cardNo) {
		super(accountNo, name, balance);
		this.cardNo = cardNo;
	}


	// �Է°� : ī���ȣ, ���ݾ�
	// ��ȯ�� : ����(int)
	// ī�尪�� �����Ѵ�.(�Ѿ�� ī���ȣ�� ���� �߱޵� ī���ȣ�� ������,
	// ���ݾ��� ���� �ܾ׺��� ������ Ȯ�� ��)
	int pay(String cardNo, int balance) {
		if (!(cardNo.equals(this.cardNo)) || getBalance() < balance) {
			System.out.println("ī���ȣ�� ���ݾ��� Ȯ���� �ּ���");
			return 0 ;
		}
		// �ܾ� = ���� �ܾ� - ī�����
		// setBalance(getBalance()-balance);
		// �θ��� withdraw �� ������ ��ɰ� ����
		// ���� �ٽ� ������ ���� �θ��� withdraw�� ����ϸ� ��
		return withdraw(balance);
	}
}
