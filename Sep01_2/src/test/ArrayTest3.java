package test;

import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {
		// int 타입의 배열 5개 생성
		// 0 10 20 30 40
		Scanner sc = new Scanner(System.in);
		int score[] = { 0, 10, 20, 30, 40 };// 가장 일반적인 방법
		
		for(int idx:score) {
			System.out.println(idx+"\t");
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}

		System.out.println();
		// String 타입의 배열 5개 생성
		// 과일이름 초기화

//		String fruit[] = new String[4];
//		for (int i = 0; i < fruit.length; i++) {
//			System.out.print("\n과일이름 작성");
//			fruit[i] = sc.next();
//
//		}
		String fruit[] = {"포도","복숭아","사과","바나나"};
		for (int i = 0; i < fruit.length; i++) {
			System.out.print(fruit[i] + "\n");
		}
		//향상된 for문
		for(String f:fruit) {
			System.out.println(f+"\t");
		}

	}
}
