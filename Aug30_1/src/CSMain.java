import java.util.Scanner;

//	��Ʈ
//	���� : 
//	�� ~�� ������
//	��������Ʈ :(1%)
//	10,000�̻� ���Ž� ����Ʈ 50�� �� 
//	���ǹ� �ݺ��� 
//	���ǹ� : Ư�� ������ ���� �帧�� �Ѿ������
public class CSMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");

		int price = k.nextInt();

		System.out.println("---------------------");
		System.out.printf("�� %d �� ����\n", price);

		int point = price / 100;

		if (price >= 10000) {
			point += 50;
		}
		if ((price >= 20000) && (price % 100 == 0)) {
			// 20000�� �̻��̰�, 10��¥�� �� �޴� ��Ȳ �Ǹ� ����Ʈ 100
			point += 100;
		} else {
			point += 10;
		}
		System.out.printf("�� ���� �ݾ� : %d ��\n", point);

		k.close();

	}
}
