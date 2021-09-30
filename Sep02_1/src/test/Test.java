package test;

public class Test {
	public static void main(String[] args) {

		int a = 45;
		int b = 78;
		int temp = a;

		a = b;
		b = temp;
		System.out.printf("a : %d b : %d ", a, b);
	}
}
