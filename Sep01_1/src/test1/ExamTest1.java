package test1;

import java.io.IOException;

//주사위 2개 던지기

//나오는 주사위 눈 출력 ex)(1,4)

//주사위 눈의 합계가 5가 아니면 계속 던진다
// 5가 되면 실행을 멈추기

public class ExamTest1 {
	public static void main(String[] args) throws IOException {
		int dice1 = 0;
		int dice2 = 0;
		int keyCode = 0;
		boolean run = true;
		while (run) {

			if (keyCode != 13 && keyCode != 10) {
				System.out.println("======2개의 주사위 합 5나오기======");
				System.out.println("  1. 던져!            2.안 해!");
				System.out.println("===================================");
				System.out.print("선택 : ");

			}
			
			keyCode = System.in.read();
			
			
			if (keyCode == 49) {
				dice1 = (int) (Math.random() * 6) + 1;
				dice2 = (int) (Math.random() * 6) + 1;

				System.out.printf("첫번쨰 주사위  : %d  \n두번째 주사위  : %d \n합은 : %d \n", dice1, dice2, (dice1 + dice2));
			} else if (keyCode == 50) {
				System.out.println("포기...");
				
				run = false;
			}

			if (dice1 + dice2 == 5) {
				System.out.println("성공");
				break;
			}
		}

	}
}
