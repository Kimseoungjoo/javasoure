package classTest;

public class GoodStockEx {
	// �Ӽ� : ��ǰ�ڵ�(p12345), ������(100),
	public static void main(String[] args) {
		
		//ù��° ��ǰ ������
		GoodStock product1 = new GoodStock();
		
		product1.code = "p12345";
		product1.stockNum = 30;
		
		//��ǰ�Ǹ� => ��� ����
		//ȣ�� => ���ϰ��� �ִٸ� ���ϰ����� �ޱ�(syso, ����)
		//System.out.println("���� ������"+product1.disStock(15));
		
		
		int stockNum = product1.subtrackStock(15);
		System.out.println("���� ������ "+stockNum);
		
		//��ǰ => ��� ����
		// �޼ҵ� ȣ�� >> ���� Ÿ���� ������ ȣ�⸸ �ϸ� ��
		product1.addStock(5);
	}
		
}





























