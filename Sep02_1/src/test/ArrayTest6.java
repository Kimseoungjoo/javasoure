package test;

public class ArrayTest6 {
	public static void main(String[] args) {
		// 이차원배열
		int scores[][] = new int[2][3];

		scores[0][0] = 15;
		scores[0][1] = 25;
		scores[0][2] = 35;

		scores[1][0] = 45;
		scores[1][1] = 55;
		scores[1][2] = 65;
		// 확인
		System.out.println("배열의 길이(행) :" + scores.length);
		System.out.println("배열의 길이(열) :" + scores[0].length);

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int score[] : scores) {
			for (int j : score) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		int arr[][] = { { 15, 25 }, { 65, 85, 95 }};// 가능은 하다 (1행,2열),(2행,3열)
		
		for (int score[] : arr) {
			for (int j : score) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//배열명만 출력했을 때
		System.out.println(scores);
		System.out.println(arr);

	}
}
