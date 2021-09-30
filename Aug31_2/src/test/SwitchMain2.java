package test;

//import java.util.Scanner;
//하고 자 하는 일, 값, 출력, 등등 같으면 묶어서 풀어라 
//캐릭터값 받아보기
public class SwitchMain2 {
	public static void main(String[] args) {

		// A or a > 우수회원
		// B or b > 일반회원
		// 아무것도 없음 > 손님
		//Scanner k = new Scanner(System.in);
		//System.out.print("손님 회원 등급(A,B,..) :");
		//char grade = k.next().charAt(0); // scanner는 string으로만 받을 수 있다. 
		//뒤에 charAt함수사용해야함
		char grade = 'b';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;
		default:
			System.out.println("손님");
			break;
		}
		if ((grade == 'A') || (grade == 'a')) {
			System.out.println("우수회원");
		} else if ((grade == 'B') || (grade == 'b')) {
			System.out.println("일반회원");
		} else
			System.out.println("손님");

	}
}
