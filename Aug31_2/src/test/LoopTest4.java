package test;

import java.util.Scanner;

//사용자에게 원하는 구구단 숫자 입력받기

public class LoopTest4 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in/*키보드로 입력을 받는다*/);

		System.out.println("원하는 구구단 숫자를 입력하세요 :");
		int user = k.nextInt();
		k.close();

		System.out.printf("----%d단-----\n", user);

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d =%d \n", user, i, (user * i));
			//==System.out.println(num+" * "+i+" = " + (num*i);
		}


	}
}
