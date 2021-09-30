package test;

//반복해야할 작업을 넣는 곳 
/*
 * for 문이 돌아가는 방식 
 * 1. int i = 0;
 * 2. i < 10
 * 3. for main 안 반복해야 할 작업 실행 ~ 
 * 4. i++; >> i = 1 (i += 1) 증감 연산자 + 1
 * 5. i < 10  (5 > 3 > 4 > 5) 반복 
 * 마지막 i = 10 
 * i < 10; 조건 불만족 > for 루프를 빠져나감 > for 종료  
 */
public class LoopTest {
	public static void main(String[] args) {
		// ; - 마침표 의미를 가지고 있다
		// 코딩은 가독성
		for (int i = 0; i < 10; i++) {// 10번 반복한다는 의미
			System.out.println("안녕하세요" + i);
		}
		System.out.println();
//1~10까지 출력
		for (int i = 1; i < 11; i++) {

			System.out.println(i);
		}
		System.out.println();

		// 0 ~ 10 짝수 출력

		for (int i = 0; i < 11; i += 2) {
			System.out.print(i + "\t");
		}

		System.out.println();

		for (int i = 3; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
	}
}