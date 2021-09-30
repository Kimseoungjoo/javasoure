package test;

import java.util.Scanner;

public class SwitchMain3 {
	public static void main(String[] args) {
		//String position = "과장";
		//직책이 부장 이면 700 과장이면 500, 나머지 300
		//position 입력 받은 후 금액 출력하는 방식
		Scanner k = new Scanner(System.in);
		System.out.print("자신의 직책을 적으세요(과장,부장..) : ");
		String position = k.next();
		k.close();
		switch (position) {
		case "부장":
			System.out.println("월급 700만원");
			break;
		case "과장":
			System.out.println("월급 500만원");
			break;

		default:
			System.out.println("월급 300만원");
			break;
		}
	}
}
