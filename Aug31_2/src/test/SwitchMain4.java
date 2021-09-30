package test;

//import java.util.Scanner;

public class SwitchMain4 {
	public static void main(String[] args) {
		//숫자를 입력받아 8 : 출근을 합니다
		// 9 : 회의를 합니다
		// 10 : 업무 중
		// 나머지 : 외근 중
		// 8~11 사이의 숫자가 나오도록 작성 (random)
		int time = (int)(Math.random()*4+8);// Math.random()*6; >> 0~5 숫자 반환
		System.out.println(time);
		switch (time) {
		case 8:
			System.out.println("출근 중");
			break;
		case 9:
			System.out.println("회의 중");
			break;
		case 10:
			System.out.println("업무 중");
			break;
		default:
			System.out.println("외근 중");
			break;
		}
	}
}
