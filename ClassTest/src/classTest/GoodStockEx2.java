package classTest;

public class GoodStockEx2 {
	public static void main(String[] args) {

		// ù��° ��ǰ ������
		GoodStock2 product1 = new GoodStock2("p1234",30);
		// Ŭ���� �ܺο��� ���� �����ϴ� ���� �ȵȴ� 
//		product1.code = "p12345";
//		product1.stockNum = 30;
		
		// ��ǰ�Ǹ� => ��� ����
		// ȣ�� => ���ϰ��� �ִٸ� ���ϰ����� �ޱ�(syso, ����)
		// System.out.println("���� ������"+product1.disStock(15));
		// ���� ����
		int stockNum = product1.subtrackStock(15);
		//���ķ� stoNum ����� �� �ִ�.
		System.out.println("���� ������ " + stockNum);

		// ��ǰ => ��� ����
		// �޼ҵ� ȣ�� >> ���� Ÿ���� ������ ȣ�⸸ �ϸ� ��
		product1.addStock(5);
		System.out.println("���� ������ :"+product1.getStockNum());
	}
}
