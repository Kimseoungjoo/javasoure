package math;

public class MathEx2 {

	public static void main(String[] args) {
		Math.random(); // 0<= Math.random() <1

		// 세 개의 랜덤값을 구하기(1~3 까지 나오도록)
		// 2 1 1
		// 1 2 3
		// 3 2 1
		// 1 1 1
//		int a,b,c;
//		boolean run = true;
//		while (run) {
//			 a = (int) (Math.random() * 3) + 1;
//			 b = (int) (Math.random() * 3) + 1;
//			 c = (int) (Math.random() * 3) + 1;
//			 if(a==b&&a==c) {
//				 run =false;
//				 System.out.printf("%d %d %d 같은 숫자 나옴",a,b,c);
//			 }else System.out.printf("%d %d %d 다시...",a,b,c);
//			 System.out.println();
//		}
		//담임쌤 coding
		while (true) {
			int num1 = (int) (Math.random() * 3) + 1;
			int num2 = (int) (Math.random() * 3) + 1;
			int num3 = (int) (Math.random() * 3) + 1;
			System.out.printf("%d\t%d\t%d",num1,num2,num3);
			if(num1==num2&& num1 == num3)
				break;
			System.out.println();
		}

	}

}
