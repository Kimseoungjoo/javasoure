package test;

//2중 for문은 행렬 관련해서 많이 사용한다.
public class LoopTest5 {
	public static void main(String[] args) {
		// ********** << 배열로 처리하기위해선 for문이 2개 사용된다
		// **********

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
				/*
				 * 실행 순서 1. int i = 0; 2.i<3; 3.안쪽 for 문의 int j=0; 4.j<3
				 * 5.System.out.print("*"); result * 6.j = j +1;(j++) > j=1 7.j<3;
				 * 8.System.out.print("*"); result ** 9.j = j +1; j==2 10. j<3;
				 * 11.System.out.print("*"); result *** 12.j = j +1; j==3 13.j<3; 안쪽 for문 종료
				 * 14.System.out.println(); 15.i++ :i = i+1 i=1 >> (1~15반복 i<3 될 때까지)
				 */
			}
			System.out.println();
		}

		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {// *
				System.out.print("*");		 // **
			}								 // ***<<예제
			System.out.println();
		}
	}
}
