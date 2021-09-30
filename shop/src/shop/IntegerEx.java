package shop;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.Scanner;

public class IntegerEx {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		
		String i = sc.next();
		
		System.out.println(i+5); // 연결의 의미로 사용됐다 
		
		int num = Integer.parseInt(i);
		System.out.println(num+6);
	}
}
