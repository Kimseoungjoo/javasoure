package classTest;


public class GoodStock {

	// �Ӽ� : ��ǰ�ڵ�(p12345), ������(100),
	String code;
	int stockNum;

	// ��� : ������ ����(�Է°� ����, ��°��� ����)
	// ������ ����(�Է°� ����, ��°��� ���� ������)
	
	void addStock(int stockNum) {
		this.stockNum += stockNum;
		System.out.println(this.stockNum);
	}

	int subtrackStock(int stockNum) {
		if (this.stockNum > stockNum) {
			this.stockNum -= stockNum;
		}
		return this.stockNum;
	}

}
