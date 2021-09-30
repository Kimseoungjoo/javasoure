package exam;

//변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변서 num
//의 값을 뺀 나머지를 구하시오
//ex) num이 24라면 크면서도 가장 가까운 10의 배수는 30 임

import java.util.Scanner;

public class NumMultiple {

	public static void main(String[] args) throws InterruptedException{

		Scanner k = new Scanner(System.in);
		
		System.out.print("원하는 숫자는 : ");
		int num = k.nextInt();
		k.close();
		int result = (num/10+1)*10; // result = num%10 >> num - result+10
		System.out.printf("원하는 숫자 %d 보다 크면서 10의 배수인 수는 %d입니다\n",num,result);
		Thread.sleep(3000);
		/*
		 * 선생님 코드
		 *  int num=81; 
		 *  System.out.println(10-(num%10)*10); 간단하게 프로그램 
		 */}

}
