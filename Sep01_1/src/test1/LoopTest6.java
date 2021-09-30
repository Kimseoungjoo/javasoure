package test1;

public class LoopTest6 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {//행을 담당
			for (int j = 0; j < 10; j++) {//열을 담당
				System.out.print("*");
			}
			System.out.println();
		}
		// 1~100 까지 정수 중에서 3의 배수만을 더하는 프로그램 작성
		// 단 , 9의 배수는 더하지 않기
		int sum = 0;
		for (int i = 0; i < 100; i += 3) {
			if (i % 9 != 0) {
				sum += i;
				System.out.println(sum);
			}
		}
		System.out.println("--3의 배수, 9의배수는 제외 합 : "+sum+"-------------");
		
		sum = 0;
		// 1~100 까지 정수 중에서 3의 배쉬거나 5의 배수인 수의 합
		for (int i = 1; i < 100; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
				System.out.println(sum);
			}
		}
		System.out.println("--3의 배수 또는 5의 배수의 합 :"+sum);
	}
}
