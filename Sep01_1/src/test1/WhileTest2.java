package test1;

import java.io.IOException;
//책 p.59예제
public class WhileTest2 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int keyCode = 0;
		int speed = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {//13>>CR, 10 >> LF : 엔터 
				//(TIP. IF 조건을 넣은 이유는 코드의 안정성을 위해서이다)
				System.out.println("=============================");
				System.out.println("1. 종속 | 2. 감속 | 3. 중지");
				System.out.println("=============================");
				System.out.println("선택 : ");
			}

			keyCode = System.in.read();//int로 반환 한것이다>> 
									   //아스키 코드값(1>>49값이 반환된다
									   //              2>>50,3>>51

			if (keyCode == 49) {// 49 >> 1
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if (keyCode == 50) {//50 >>2
				speed--;
				System.out.println("현재속도 : " + speed);
			} else if (keyCode == 51) {//51 >>3
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}
}
