import java.util.Iterator;
import java.util.Scanner;

public class CaculatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("물품의 가격 :");
		int price = k.nextInt();

		System.out.print("고객님의 주신 돈 : ");
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
		System.out.printf("만원 : %d\n",man);
		System.out.printf("천원 : %d\n",cheon);
		System.out.printf("오백원 : %d\n",oh);
		System.out.printf("백원 : %d\n",back);
		System.out.printf("십원 : %d\n",sib);
		/*
		 * int change[] = { 10000, 5000, 1000, 500, 100, 10 };
		 *  for (int i = 0; i < 6;i++) {
		 *  	 System.out.println(change[i] + "원 :" + changecost / change[i]);
		 * 		 changecost %= change[i];
		 * }
		 */
	}
}
