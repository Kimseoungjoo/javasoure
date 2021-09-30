package test1;
//구구단

public class LoopTest8 {
	public static void main(String[] args) {

//		String star = "*";
//		String sum="";
//		System.out.println();
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; i <= j; j--) {  
//				System.out.print(" ");
//			}
//			sum += star;
//			System.out.println(sum);
//		}
//선생님
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j <= i ? "*" : " ");//if/else 문은 3항연산자로가능하다.
			}
			System.out.println();
//				if(j<=i) {
//					System.out.print("*");
//				}else
//					System.out.print(" ");
//			}
//			System.out.println();
		}
	}
}
