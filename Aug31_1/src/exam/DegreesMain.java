package exam;

import java.util.Scanner;

//받은 화씨온도 > 섭씨온도로 변환  출력하기
/*
 * Scanner k = new Scanner(System.in); 
 * System.out.print("화씨 온도를 적어주세요 :");
 * double hwa = k.nextDouble(); 
 * k.close();
 * System.out.printf("섭씨 온도는 %.2f 도 입니다 \n",(hwa-32)/1.8);
 */

public class DegreesMain {
	public static void main(String[] args) {
		// 화씨온도>> 섭씨온도로 변환 프로그램
		// 조건 화씨온도 입력받기(정수)
		Scanner k = new Scanner(System.in/* 키보드에서 입력을 받는다는 의미 */);
		System.out.print("화씨 온도 입력 :");
		int fahr = k.nextInt(); // 변수에다가 입력을 넣는 작업
		k.close();
		//받은 화씨온도 >> 섭씨온도로 변환 후 출력하기
		// (화씨온도 -32)*5/9
		double sub = (fahr-32)*5/9.0;//(fahr-32)*5/9 << int 정수로 답이나온다. 
		//그렇기에 형변환 (double)을 사용해주거나/ 소수점으로 변환 
		System.out.println("섭씨온도 : " + sub);
		System.out.printf("섭씨온도 : %.4f", sub);

	}
}
