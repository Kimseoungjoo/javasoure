package classTest;

public class Account2 {
	//�Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����), �̸�
	//��� : �Ա�, ���
	//�Ա��Ѵ�. (�Է°� : �Ա޾�, ��ȯ��:����) => �����ܾ� +=�Աݾ�
	//����Ѵ�. (�Է°� : �Ա޾�, ��ȯ��:����) => �����ܾ� -=��ݾ�
	
	// ������ �ۼ�
	// [���콺 ������] -> [source] -> [Generate Constructor using fields...]
	// [���콺 ������] -> [source] -> [Generate Constructor using super class...] >> default ������
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
	//��� ������ ���� �����ϰ� �ʹٸ�?
	//get~ ���� ����
	public int getBalance() {
		return balance;
	}
	
	// ��� : �Ա��Ѵ�/
	void deposit(int inMoney)	{
		balance +=inMoney;
	}

	//  	  ����Ѵ�.
	int withdraw(int outMoney) {
		this.balance -= outMoney;
		return balance;
	}
	
	
	// �ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾���
	// set ~ ���� �޼ҵ带 �ۼ��Ѵ�.
	
	// ������� : ���¹�ȣ�� �����ϰ� �ʹٸ� ?
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

