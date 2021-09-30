import java.util.Scanner;

//	ex) 24시간운영 = 1 << 0 :1
//		주차 	=	 1 << 1 : 2
//		흡연실	=	 1 << 2 : 4
//		와이파이 = 	 1 << 3 : 8
//		배달    =  1 << 4 : 16
//	EX)
//	A특성 = 1 > 24시간
//	B	  = 2 > 주차
//	C	  = 8 > 와이파이
//	D	  = 3 > 24시간 + 주차
//	E	  = 6 > 4+2 주차 + 흡연실
//	F	  = 10 > 8 +2 주차 + 와이파이  
//	G	  = 11 > 8 + 2 + 1 24시간,주차,와이파이
//	H 	  = 13 > 8 + 4 + 1 와이파이 + 흡연 + 24시 
//	대부분 2항 연산
//		a < 2
//		1 + 2
//	1항(단항) 연산
//		!d
//	3항연산
//	연산자는 stack영역이 대상이다 
public class ShiftOperatorMain {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.print("원하는 숫자 입력(1~31) : ");

		int value = k.nextInt();
		k.close();
		// 배열, 컬렉션
		if (value >= 16) {
			System.out.print("배달 ");
			value -= 16;
		}
		if (value >=8) {
			System.out.print("와이파이 ");
			value -= 8;
		}
		if (value >= 4) {
			System.out.print("흡연실 ");
			value -= 4;
		}
		if (value >= 2) {
			System.out.print("주차 ");
			value -= 2;
			System.out.println((value == 1) ? "24시간운영" : "\n");
		}

	}
}
