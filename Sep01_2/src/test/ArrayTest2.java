package test;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		//int 타입의 변수 10개를 선언
		//담고싶은 타입 배열명 [] = new  
		
		Scanner sc = new Scanner(System.in);
		
		//배열의 선언과 생성(힙)
		int scores[] = new int[10];
		
		
		int arr[]; //선언
		arr = new int[10];
		
		//배열의 선언과 생성 및 초기화
		int arr2[] = {12,23,42,6,3,7,3,3};
		
		System.out.println(arr2.length);
		
		for(int i =0 ;i<arr2.length;i++) {//lenght는 배열의 길이를 뜻한다
			System.out.print(arr2[i]+ " ");
		}

	}

}
