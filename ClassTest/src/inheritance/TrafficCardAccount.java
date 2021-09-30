package inheritance;

// Account2
// CheckingAccount
public class TrafficCardAccount extends CheckingAccount {

	//CheckingAccount => ���¹�ȣ , ������, �ܾ�, ī���ȣ
	//CheckingAccount => �Ա��ϴ�, ����ϴ�, üũī�� ����
	private boolean hasTrafficCard;
	
	public TrafficCardAccount(String accountNo, String name, int balance, 
			String cardNo, boolean hasTrafficCard) {
		super(accountNo, name, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}
	// ����ī�� ��� ����
	
	
	// ����ī�� ����� �ִٸ� ����� �����Ѵ�.
	// �Է°� : ī���ȣ, ����
	// ��ȯ�� : ������(int)
	int trafficPay(String cardNo, int amount) {
		if(!hasTrafficCard) {// ���� �� hasTrafficCard !=true
			System.out.println("����ī�� ����� �����ϴ�.");
			return 0;
		}
		return pay(cardNo, amount);
	}

	
}
