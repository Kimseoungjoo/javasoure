package classTest;

public class CardEx {
	public static void main(String[] args) {
		Card card1 = new Card("spade",7);
		cardPrint(card1);
//	card1.width = 8;
//	card1.height = 4;
//		Card.width = 8;
//		Card.height = 4;
		System.out.println();
		Card card2 = new Card("heart",4);
		cardPrint(card2);
	}
	static void cardPrint(Card c) {
		System.out.println("��� : "+c.getKind());
		System.out.println("���� : "+c.getNumber());
		System.out.printf("ī�� ũ�� : (%d,%d)\n",Card.width,Card.height);
	}
}
