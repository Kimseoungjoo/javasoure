import java.util.Scanner;

// 중간고사 : 
// 기말고사 : 
//--------------
// 평균 : 
// 평균은 소수점 한자리만
public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("중간고사 점수 :");
		int score1 = k.nextInt();

		System.out.print("기말고사 점수 :");
		int score2 = k.nextInt();

		System.out.println("----------------");
		k.close();
		double average = (double) (score1 + score2) / 2;
		System.out.printf("평균 점수는 : %.1f 입니다\n", average);
		// 평균 점수가 90 이상이면 수라고 출력, 아니면 야 !
		// System.out.println((average>=90)?"수": "야");
		if (average >= 90) {
			System.out.println("수");
		}else if (average >= 80) {
			System.out.println("우");
		} else if (average >= 70)

		{
			System.out.println("미");
		} else if (average >= 60) {
			System.out.println("양");
		} else
			System.out.println("가");

		 /*
		 * else { System.out.println("야!!"); if (average>=80) {
		 * System.out.println("다음에는 잘해라~"); } }
		 */
		
	}
}
