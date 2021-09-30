import java.util.Scanner;

// scan / 입출력 / 논리연산자 / 복합연산자 / 변수
public class Review {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("과일 : ");
		String fruit = k.next();
		System.out.print("과일 가격 : ");
		int price = k.nextInt();
		System.out.print("과일 갯수 : ");
		int count = k.nextInt();
		System.out.println("---------------------");
		System.out.printf("과일 : %s 갯수 : %d 가격 :%d \n", fruit, count, price);
		System.out.printf("총 지불액 : %d \n", price * count);
		boolean isSale = (count > 9) && (price >= 1000);
		System.out.printf("할인 여부 : %b",isSale);

		k.close();
	}

}
