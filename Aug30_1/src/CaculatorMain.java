import java.util.Iterator;
import java.util.Scanner;

public class CaculatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("��ǰ�� ���� :");
		int price = k.nextInt();

		System.out.print("������ �ֽ� �� : ");
		int price1 = k.nextInt();
k.close();
		System.out.println("-----------------------------");

		int changecost = price1 - price;
		int man = changecost/10000;
		int cheon = changecost%10000/1000;
		int oh = changecost%1000/500;
		int back = changecost%500/100;
		int sib = changecost%100/10;
		System.out.println(changecost);
		System.out.printf("���� : %d\n",man);
		System.out.printf("õ�� : %d\n",cheon);
		System.out.printf("����� : %d\n",oh);
		System.out.printf("��� : %d\n",back);
		System.out.printf("�ʿ� : %d\n",sib);
		/*
		 * int change[] = { 10000, 5000, 1000, 500, 100, 10 };
		 *  for (int i = 0; i < 6;i++) {
		 *  	 System.out.println(change[i] + "�� :" + changecost / change[i]);
		 * 		 changecost %= change[i];
		 * }
		 */
	}
}
