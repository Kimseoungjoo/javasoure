package shop;

public class ShopEx {
	public static void main(String[] args) {
		Myshop shop = new Myshop();
		// ���� �̸� ����
		shop.setTitle("�ѳ��Ӹ����¼�");
		// �� ���� 
		shop.genUser();
		
		// ��ǰ ���� 
		shop.genProduct();
		shop.start();
	}
}
