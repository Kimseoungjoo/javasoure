package classTest;

public class GoodStock2 {
	// �Ӽ� : ��ǰ�ڵ�(p12345), ������(100),
	private String code;
	private int stockNum;

	// ��� : ������ ����(�Է°� ����, ��°��� ����)
	// ������ ����(�Է°� ����, ��°��� ���� ������)
	
	//����Ʈ ������
	GoodStock2(){
		
	}
	//������ �����ε�
	// ������� �ʱ�ȭ ����
	GoodStock2(String code, int stockNum){
		this.code = code;
		this.stockNum = stockNum;
		
	}
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
	// ���� �������� ������ ���
	int getStockNum() {
		return  stockNum;
	}
}
