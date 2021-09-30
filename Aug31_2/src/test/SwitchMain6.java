package test;

import java.util.Scanner;

// 가위(1), 바위(2), 보(3)
// 상대방 - 컴퓨터
// 랜덤 1~3 자동으로 생성 
// 내가 받는 부분 - 입력 
public class SwitchMain6 {
	public static void main(String[] args) {
		/*
		 * Scanner k = new Scanner(System.in);
		 * 
		 * System.out.print("가위 바위 보 중 무엇을 내시겠습니까(1,2,3)? :");
		 *  int me = k.nextInt();
		 * k.close();
		 * 
		 * int rsp = (int) (Math.random() * 3) + 1; 
		 * int result = me - rsp;
		 * 
		 * System.out.println("내가 낸 값 : " + me);
		 *  System.out.println("컴퓨터가 낸 값 : " + rsp);
		 * 
		 * switch (result) {
		 * 
		 * case -2: case 1:
		 * System.out.println("이겼습니다"); break; }
		 *  break;
		 *   case -1: case 2:
		 * System.out.println("졌습니다");
		 *  break;
		 * 
		 * default: 
		 *  System.out.println("비겼습니다");
		 */// 내가 짠거
		Scanner k = new Scanner(System.in);
		
		int com = (int)(Math.random()*3)+1;
		
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 : ");
		int user = k.nextInt();
		k.close();
		
		System.out.println("나 : "+user+", 컴퓨터 : "+com);
		
		switch (user-com) {
		
		case 1: case -2:
			System.out.println("당신이 이겼습니다");
			break;
		
		case 2: case -1:
			System.out.println("당신이 졌습니다");
			break;
		
		default:
			System.out.println("비겼습니다");
			break;
		}		
	}
}