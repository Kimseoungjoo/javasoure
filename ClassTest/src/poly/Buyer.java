package poly;

public class Buyer {
	int money = 2000;
	int bonusPoint = 0;
	
	void buy(Product p) { // Product p = new Tv(100);,
							// Product p = new Audio(50);
							// Product p = new Computer(150);
		if (money < p.getPrice()) {
			System.out.println("�ܾ׺������� ���� ���� ���� ����");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		System.out.println(p+ "�� �����ϼ̽��ϴ�");
	}

}
