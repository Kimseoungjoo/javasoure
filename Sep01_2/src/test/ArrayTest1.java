package test;

public class ArrayTest1 {

	public static void main(String[] args) {
		//Array 배열 >>
		//int 타입의 변수 10개 생성
		//int a=1 b=2 c=3 d=1....
		
//		int sum;
//		sum = 0;
//		System.out.println(sum);
		
		
		//배열(참조타입)
		//참조타입 : heap / null/자동으로 초기화
		//정수 : 0, 실수 : 0.0 , boolean : false 초기화가된다
		int arr[] = new int[10];
		
		//개별 요소에 접근 0번부터 시작(0~9)
		System.out.println(arr[0]);
		System.out.println(arr[9]);
		arr[3] = 90;
		arr[2] = 20;
		arr[7] = 120;
		for(int i = 0; i <10; i++) {
			System.out.println(arr[i]);
		}
		int i=0;
		while(i<10) {
			System.out.println(arr[i]);
			i++;
		}
		
		
		
	}

}
