package test;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		//int Ÿ���� ���� 10���� ����
		//������ Ÿ�� �迭�� [] = new  
		
		Scanner sc = new Scanner(System.in);
		
		//�迭�� ����� ����(��)
		int scores[] = new int[10];
		
		
		int arr[]; //����
		arr = new int[10];
		
		//�迭�� ����� ���� �� �ʱ�ȭ
		int arr2[] = {12,23,42,6,3,7,3,3};
		
		System.out.println(arr2.length);
		
		for(int i =0 ;i<arr2.length;i++) {//lenght�� �迭�� ���̸� ���Ѵ�
			System.out.print(arr2[i]+ " ");
		}

	}

}
