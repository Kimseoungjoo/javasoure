package shop;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.Scanner;

public class IntegerEx {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� :");
		
		String i = sc.next();
		
		System.out.println(i+5); // ������ �ǹ̷� ���ƴ� 
		
		int num = Integer.parseInt(i);
		System.out.println(num+6);
	}
}
