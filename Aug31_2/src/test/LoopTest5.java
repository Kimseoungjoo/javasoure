package test;

//2�� for���� ��� �����ؼ� ���� ����Ѵ�.
public class LoopTest5 {
	public static void main(String[] args) {
		// ********** << �迭�� ó���ϱ����ؼ� for���� 2�� ���ȴ�
		// **********

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
				/*
				 * ���� ���� 1. int i = 0; 2.i<3; 3.���� for ���� int j=0; 4.j<3
				 * 5.System.out.print("*"); result * 6.j = j +1;(j++) > j=1 7.j<3;
				 * 8.System.out.print("*"); result ** 9.j = j +1; j==2 10. j<3;
				 * 11.System.out.print("*"); result *** 12.j = j +1; j==3 13.j<3; ���� for�� ����
				 * 14.System.out.println(); 15.i++ :i = i+1 i=1 >> (1~15�ݺ� i<3 �� ������)
				 */
			}
			System.out.println();
		}

		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {// *
				System.out.print("*");		 // **
			}								 // ***<<����
			System.out.println();
		}
	}
}
