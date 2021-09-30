package test1;

import java.util.Scanner;

public class DowhileTest3 {
	public static void main(String[] args) {
		// 컴퓨터가 1~100사이의 정수를 임의로 선정
		// 사용자는 컴퓨터가 가지고 있는 숫자가 무엇인지 알아맞추기
		int num = (int) (Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		int user = 0;
		do {
			System.out.print("예측한 숫자를 입력해주세요 >>");
			user = sc.nextInt();
			if (user < num) {
				System.out.println("땡!! 좀 더 큰 수를 입력해주세요");
			} else
				System.out.println("땡!! 좀 더 작은 수를 입력해주세요");
		} while (user != num);
		sc.close();
		System.out.println("정답입니다~ ");
		System.out.println(num);
	}
}
