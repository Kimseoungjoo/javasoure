package inheritance;

public class CreditLineAccount extends Account2 {
	private int creditLine; // ���̳ʽ� �ѵ�

	public CreditLineAccount(String accountNo, String name, int balance, int creditLine) {
		super(accountNo, name, balance);
		this.creditLine = creditLine;
	}
//	���¹�ȣ, ������, �ܾ�, ���̳ʽ��ѵ� / �Ա��ϴ�, ����ϴ�

	// ����ϴ� �������̵�
	// �θ��� ��� : �ܾ� = �ܾ� - ��ݾ�;
	// �ڽ� : �ܾ�(�����ܾ� + ���̳ʽ� �ѵ���) - ��ݾ�
	@Override
	int withdraw(int outMoney) {
		// �����ܾ� +���̳ʽ� �ѵ� �ʵ庸�� ���ݾ��� ������ ����Ұ�msg
		if ((getBalance() + creditLine) < outMoney)
		{
			System.out.println("���ݾ� �ѵ�����Ұ�");
			return 0;
		}
			// �ܾ�(�����ܾ� + ���̳ʽ� �ѵ���) - ��ݾ�
			setBalance(getBalance()-outMoney);
			return getBalance();
	}

}
