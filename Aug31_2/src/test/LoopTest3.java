package test;

//구구단

public class LoopTest3 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.printf("2 * %d =%d \t", i, (2 * i));
		}
		
		System.out.println();
		
		for (int i = 2; i < 10; i++) {
			System.out.println("구구단 " + i + "단");
			for (int k = 1; k < 10; k++) {
				System.out.println(i + " x " + k + " = " + i * k);
			}
		}

	}
}
