package test;

public class ArrayTest8 {
	public static void main(String[] args) {

		// 숫자 카드 45장(1~45)
		int card[] = new int[45];

		for (int i = 0; i < card.length; i++) {
			card[i] = i + 1;
		}

		for (int i : card) {
			System.out.printf("%2d  ", i);
		}
		System.out.println();
		// 카드 섞기

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
