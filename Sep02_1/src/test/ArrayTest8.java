package test;

public class ArrayTest8 {
	public static void main(String[] args) {

		// ���� ī�� 45��(1~45)
		int card[] = new int[45];

		for (int i = 0; i < card.length; i++) {
			card[i] = i + 1;
		}

		for (int i : card) {
			System.out.printf("%2d  ", i);
		}
		System.out.println();
		// ī�� ����

		for (int i = 0; i < card.length; i++) {
			int j = (int) (Math.random() * 45);
			int temp = card[i];
			card[i] = card[j];
			card[j] = temp;

		}
		for (int i : card) {
			System.out.printf("%2d  ", i);
		}

	}
}
