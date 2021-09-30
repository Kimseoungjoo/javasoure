import java.util.Scanner;

//	마트
//	가격 : 
//	총 ~원 구매함
//	적립포인트 :(1%)
//	10,000이상 구매시 포인트 50점 더 
//	조건문 반복문 
//	조건문 : 특정 조건일 때만 흐름이 넘어오도록
public class CSMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("가격 : ");

		int price = k.nextInt();

		System.out.println("---------------------");
		System.out.printf("총 %d 원 구매\n", price);

		int point = price / 100;

		if (price >= 10000) {
			point += 50;
		}
		if ((price >= 20000) && (price % 100 == 0)) {
			// 20000원 이상이고, 10원짜리 안 받는 상황 되면 포인트 100
			point += 100;
		} else {
			point += 10;
		}
		System.out.printf("총 적립 금액 : %d 원\n", point);

		k.close();

	}
}
