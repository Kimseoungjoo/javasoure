import java.util.Scanner;

// scan / ����� / �������� / ���տ����� / ����
public class Review {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");
		String fruit = k.next();
		System.out.print("���� ���� : ");
		int price = k.nextInt();
		System.out.print("���� ���� : ");
		int count = k.nextInt();
		System.out.println("---------------------");
		System.out.printf("���� : %s ���� : %d ���� :%d \n", fruit, count, price);
		System.out.printf("�� ���Ҿ� : %d \n", price * count);
		boolean isSale = (count > 9) && (price >= 1000);
		System.out.printf("���� ���� : %b",isSale);

		k.close();
	}

}
