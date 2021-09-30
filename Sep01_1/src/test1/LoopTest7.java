package test1;
//구구단

public class LoopTest7 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {

			System.out.println("----" + i + " 단----");

			for (int j = 1; j < 10; j++) {

				System.out.printf("%d x %d = %d \n", i, j, (i * j));

			}

		}

		System.out.println();
		for (int i = 2; i < 10; i++) {

			System.out.print("----" + i + " 단----\t");

			for (int j = 1; j < 10; j++) {

				System.out.printf("%d x %d = %2d   "/*%2d줄맞춤*/, i, j, (i * j));

			}
			System.out.println();

		}
	}
}
